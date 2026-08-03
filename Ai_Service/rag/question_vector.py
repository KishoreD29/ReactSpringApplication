import faiss
import pickle
import numpy as np
from sentence_transformers import SentenceTransformer

model = SentenceTransformer("all-MiniLM-L6-v2")

# Load vector database
index = faiss.read_index("vectors.index")

# Load chunks
with open("chunks.pkl", "rb") as f:
    chunks = pickle.load(f)

while True:

    question = input("Ask your question: ")

    if question.lower() == "exit":
        break

    # Convert question to embedding
    question_embedding = model.encode([question]).astype("float32")

    # Search top 3 similar chunks
    distances, indices = index.search(question_embedding, 3)

    print("\nRetrieved Chunks:\n")

    for i in indices[0]:
        print("--------------------------------")
        print(chunks[i])