async function getData() {
    const url1='https://jsonplaceholder.typicode.com/posts/1';
    const url2='https://jsonplaceholder.typicode.com/posts/2'
    let [data1,data2]=await Promise.all([
        fetch(url1),
        fetch(url2)
    ])
  //  localStorage.setItem("post1",JSON.stringify(data1)); //data not usually stored in data storage
  //  localStorage.getItem("post1");
  //  localStorage.setItem("post2",JSON.stringify(data2));
 //   localStorage.getItem("post2");
   // console.log(data1)
    console.log("separator")
  //  console.log(data2)
}

getData();
// can also try data.ok and candirectly catch error

// data= [...document.querrySelectorAll(".classNamename")]  gives data in array instead if node elements
// data.map(el => el.href);  maps every elemt of array to function el and applies it on it.
// const out = new Blob([JSON.stringify(data,null, 2)], { type: 'application/json' });
//const b=document.createElement("c");
//b.href=URL.createObjectURL(outs);




let x=Math.floor(Math.random()*898);  //as 898 pokemons index from 0 to 897
let y=Math.floor(Math.random()*6)     // as 6 types of stats index from 0 to 5
async function apicall() {
    const url1 = "https://pokeapi.co/api/v2/pokemon?limit=898";
    const response = await fetch(url1);
    const data = await response.json();
    let naam=data["results"][x]["name"];
    const url2= "https://pokeapi.co/api/v2/pokemon/"+data["results"][x]["name"];
    const response2=await fetch(url2);
    const data2=await response2.json();
    let statname=data2["stats"][y]["stat"]["name"];
    let statvalue=data2["stats"][y]["base_stat"]
    return {naam,statname,statvalue};

}

async function main(){
    let results=await apicall();
    console.log(results.naam);
    console.log(results.statname);
    console.log(results.statvalue);
}



async function qwe(){
    const url1= "https://pokeapi.co/api/v2/pokemon/charizard";
    const url2="https://pokeapi.co/api/v2/pokemon/pikachu";
    let [response1,response2]=await Promise.all([
        fetch(url1),
        fetch(url2)
    ]);
    let [data1,data2]=await Promise.all([
        response1.json(),response2.json()
    ]);
    console.log(data1["stats"][0]["stat"]["name"]);
}
qwe();

//gives prompt to user changes you mad emay not be saved
window.addEventListener('beforeunload', function(event) {
    event.preventDefault();
});
