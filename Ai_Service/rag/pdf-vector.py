import faiss
import pickle
import numpy as np

from pypdf import PdfReader
from sentence_transformers import SentenceTransformer

# Load embedding model
model = SentenceTransformer("all-MiniLM-L6-v2")


def read_pdf(pdf_path):
    reader = PdfReader(pdf_path)

    text = ""

    for page in reader.pages:
        page_text = page.extract_text()
        if page_text:
            text += page_text + "\n"

    return text


def create_chunks(text, chunk_size=50):

    chunks = []

    for i in range(0, len(text), chunk_size):
        chunks.append(text[i:i + chunk_size])

    return chunks


def create_vector_store(pdf_path):

    print("Reading PDF...")

    text = read_pdf(pdf_path)

    print("Creating Chunks...")

    chunks = create_chunks(text)

    print("Creating Embeddings...")

    embeddings = model.encode(chunks)

    dimension = embeddings.shape[1]

    index = faiss.IndexFlatL2(dimension)

    index.add(np.array(embeddings).astype("float32"))

    faiss.write_index(index, "vectors.index")

    with open("chunks.pkl", "wb") as f:
        pickle.dump(chunks, f)

    print("Vector Store Created Successfully")


if __name__ == "__main__":
    create_vector_store("doctor.pdf")