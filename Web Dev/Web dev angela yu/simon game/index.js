var gamePattern=[];
var userPattern;
var level=0;
function nextSequence(){
    $(".g").off("click",handleUser);
    userPattern=[];
    $("h1").text("Level "+(++level));
    var rand=Math.floor((Math.random()*4));
    var color;
    switch(rand){
        case 0:
            color="red";
            break;
        case 1:
            color="yellow";
            break;
        case 2:
            color="green";
            break;
        case 3:
            color="blue";
            break;
        default:
            console.log("error");
            break;
    }
    gamePattern.push(color);
    $("#"+color).fadeOut(100).fadeIn(100);
    new Audio("./sounds/"+color+".mp3").play();
    $(".g").on("click",handleUser);
}

function handleUser(){
    var color=$(this).attr("id");
    new Audio("./sounds/"+color+".mp3").play();
    animatePress(color);
    userPattern.push(color);
    console.log(userPattern);
    checkAns(userPattern.length);
}

function animatePress(color){
    $("#"+color).addclassName("pressed");
    setTimeout(function(){$("#"+color).removeclassName("pressed")},50);
}

function checkAns(currLevel){
    if(userPattern[currLevel-1]===gamePattern[currLevel-1]){
        if(currLevel===gamePattern.length){
            setTimeout(nextSequence,500);
        }
    }
    else{
        gameOver();
    }
}

function gameOver(){
    new Audio("./sounds/wrong.mp3").play();
    $("h1").text("Game Over! Press any key to restart!");
    $("body").addclassName("gameOver");
    setTimeout(function(){
        $("body").removeclassName("gameOver");
    },200);
    level=0;
    gamePattern=[];
    $(document).on("keydown",start);
}

function start(){
    $(document).off("keydown",start);
    nextSequence();
}

$(document).on("keydown",start);
