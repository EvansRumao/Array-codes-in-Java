#will use for try catch in fastapi
from fastapi import FastAPI,HTTPException
from pydantic import BaseModel

app=FastAPI()

students={
   "001":{"name":"ravi","marks":65,"Grade":"B"},
   "002":{"name":"ravish","marks":30,"Grade":"F"},
   "003":{"name":"ravi sharma","marks":70,"Grade":"A"},
   "004":{"name":"ravina","marks":80,"Grade":"O"},
}

@app.get("/student/{studentID}")
def get_Student(studentID:str):
 if studentID not in students:
    raise HTTPException(
      status_code=404,
      detail=f"the id {studentID} not found"
    )

 return students[studentID]
  


# raise HTTPException(
#  status_code=404,
#  detail="Not found"
# )