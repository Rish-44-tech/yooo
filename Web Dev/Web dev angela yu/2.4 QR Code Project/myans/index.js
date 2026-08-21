/* 
1. Use the inquirer npm package to get user input.
2. Use the qr-image npm package to turn the user entered URL into a QR code image.
3. Create a txt file to save the user input using the native fs node module.
*/
import inquirer from "inquirer";
import {writeFile} from "fs";
import {createWriteStream} from "fs";
import {error} from "console";
import {image} from "qr-image";

const answers=await inquirer.prompt([
    {
        type:'input',
        name:'url',
        message:"Provide url: ",
        default(){
            return "www.google.com";
        }
    }
])

const url=answers.url;
writeFile("url.txt",url,(e)=>{
    if(e) throw error
    console.log("File written successfully!");
});

const qr_png=image(url,{"type":"png"});
qr_png.pipe(createWriteStream("qr.png"));