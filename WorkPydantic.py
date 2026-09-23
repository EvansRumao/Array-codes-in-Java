from fastapi import FastAPI
from pydantic import BaseModel

app = FastAPI()

class LoanApplication(BaseModel):
    name: str
    age: int
    income: float
    loan_amount: float
    employment_years: int


@app.post("/predict")
def predict_loan(application: LoanApplication):
    return {
        "message": "Data received successfully",
        "data": application
    }