from openai import OpenAI
from question_vector import search

client = OpenAI(
    api_key="YOUR_OPENAI_API_KEY"
)


def ask_question(question):

    context = search(question)

    prompt = f"""
You are a helpful medical assistant.

Use ONLY the context below to answer.

Context:
{context}

Question:
{question}

Answer:
"""

    response = client.chat.completions.create(
        model="gpt-4.1-mini",
        messages=[
            {
                "role": "user",
                "content": prompt
            }
        ]
    )

    return response.choices[0].message.content


if __name__ == "__main__":

    while True:

        question = input("Ask your question: ")

        if question.lower() == "exit":
            break

        answer = ask_question(question)

        print("\nAnswer:\n")
        print(answer)