import express from "express";
const app=express();
const port=3000;

app.get("/",(req,res)=>{
    res.send("<h3>hello worlds</h3>");
})

app.get("/about",(req,res)=>{
    res.send("pooopyy");
})

app.get("/contact",(req,res)=>{
    res.send("C:\\Users\\jalan\\Downloads\\RegisteredCoursesList (1).pdf");
})
app.listen(port,()=>{
    console.log(`App running on port ${port}`);
})