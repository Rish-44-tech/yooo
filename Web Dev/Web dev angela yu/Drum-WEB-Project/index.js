function handleSound(val){
    switch(val){               
        case "w":
            new Audio("./sounds/tom-1.mp3").play();
            break;
        case "a":
             new Audio("./sounds/tom-2.mp3").play();
                break;
        case"s":
            new Audio("./sounds/tom-3.mp3").play();
            break;
        case"d":
            new Audio("./sounds/tom-4.mp3").play();
            break;
        case"j":
            new Audio("./sounds/snare.mp3").play();
            break;
        case"k":
            new Audio("./sounds/kick-bass.mp3").play();
            break;
         case"l":
            new Audio("./sounds/crash.mp3").play();
            break;
        default:
            console.log(this);
            break;
    }
};

function buttonAnimation(key){
    document.querySelector("."+key).classNameList.add("pressed");
    setTimeout(function(){
        document.querySelector(".pressed").classNameList.remove("pressed")
    },10);
};

    //if we define fn earlier then we write handleClick not handleClick() as if we write handleClick() it will straightaway call it irrespective of event listener sionce its a straightup fn call instead of passing fn name as arg
    //querySelector selcts first instance, querySelectorAll selects all instances and we can iterate over it just like done above for getElementByclassNameName
    //'this' is the identity of the object that triggered the event listener when using regular fns with event listeenr.. console.log(this) will give <button className="drum w">w</button> if w was clicked..
    //for arrow fns this won't work like above.. so preefr to use i.innerHTML instead of this right now
for(const i of document.getElementsByclassNameName("drum")){
    i.addEventListener("click",function(){
        handleSound(this.innerHTML);
        buttonAnimation(this.innerHTML);
    }
);
}
document.addEventListener("keydown",function(e){
    handleSound(e.key);
    buttonAnimation(e.key);
}
);
