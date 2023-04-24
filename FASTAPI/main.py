from typing import Union
import uvicorn
from fastapi import FastAPI
from pydantic import BaseModel
from enum import Enum

app = FastAPI()

@app.get("/")
async def root():
    return {"message":"Hello World"}

@app.post("/")
async def post():
    return {"Message":"Hi"}

@app.put("/")
async def put():
    return {"Message":"Hello"}

if __name__ == "__main__":
    uvicorn.run("main:app", host="127.0.0.1", port=8000,log_level="info", reload=True, workers=2)