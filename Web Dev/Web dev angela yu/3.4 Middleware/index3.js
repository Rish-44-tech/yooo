import express from "express";

const app = express();
const port = 3000;

app.use(logger);

app.get("/", (req, res) => {
  res.send("Helloooooooooooooooooo");
});

app.listen(port, () => {
  console.log(`Listening on port ${port}`);
});

function logger(req,res,next){
  console.log(`Response Method: ${req.method} Response URL: ${req.url}`);
  next();
}
