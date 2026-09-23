from fastapi import FastAPI

app = FastAPI()

customer_deatil={
  101:{"name":"ravi gandhi","risk":"low","score":12},
  102:{"name":"modi ji ","risk":"high","score":100},
  103:{"name":"dharmandra pradan","risk":"medium","score":2}

}
Customers={
  101:{"name":"ravi gandhi","risk":"low","score":12},
  102:{"name":"modi ji ","risk":"high","score":100},
  103:{"name":"dharmandra pradan","risk":"medium","score":2}

}

@app.get("/customer/{models}/{customer_id}")
def customer_details(models:str,customer_id:int):
  if customer_id not in customer_deatil:
   print("the customer id is not found")
   return{"error":f"customer id not found"}

  value=Customers[customer_id]

  
  return{
    "name":value["name"],
    "risk":value["risk"],
     "score":value["score"]
     
  } 
@app.get("/customer/{customer_id}")
def customer_details(customer_id:int):
  if customer_id not in customer_deatil:
   print("the customer id is not found")
   return{"error":f"customer id not found"}

  value=customer_deatil[customer_id]

  
  return{
    "name":value["name"],
    "risk":value["risk"],
     "score":value["score"]
     
  } 

# Example customers list
customers = [
    {"id": 1, "score": 700, "risk": "Low"},
    {"id": 2, "score": 650, "risk": "Medium"},
    {"id": 3, "score": 700, "risk": "High"},
]

@app.get("/customers")
def get_customer(score: int, risk: str):
    filtered = [
        c for c in customers
        if c["score"] == score and c["risk"] == risk
    ]

    return {
        "score": score,
        "risk": risk,
        "count": len(filtered),
        "customers": filtered
    }
    
