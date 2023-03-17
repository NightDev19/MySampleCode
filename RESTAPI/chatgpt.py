API_KEY = "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"
import openai ,os

os.environ['OPENAI_Key']=API_KEY
openai.api_key=os.environ['OPENAI_Key']

Keep_Prompting = True
while Keep_Prompting:
    prompt = input("What's your question? Type Exit If Done.")
    if prompt.upper() == "EXIT": Keep_Prompting = False
    else: 
        response=openai.Completion.create(engine="text-curie-001",prompt=prompt,max_token = 200)
        print(response["choice"][0]["text"])
