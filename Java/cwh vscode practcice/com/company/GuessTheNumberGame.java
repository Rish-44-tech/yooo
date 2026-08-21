package com.company;
import java.util.Scanner;
import java.util.Random;
class Game{
    int noOfGuesses=0;
    int userInput;
    int generatedNumber;
    Game(){
        Random rand=new Random();
        this.generatedNumber=rand.nextInt(101);
    }
    int takeUserInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Guess(0-100): ");
        this.userInput=sc.nextInt();
        return userInput;
    }
    boolean checkUserInput(){
        noOfGuesses++;
        if(userInput==generatedNumber){System.out.printf("Congratulations!!\nThe number is %d!\nYou guessed it in %d attempts!\n",generatedNumber,noOfGuesses);
            return true;
        }
        else if(userInput>generatedNumber){
            System.out.println("Too High...");
            return false;
        }
        else{
            System.out.println("Too Low...");
            return false;
        }
    }
    String playAgain(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Do you want to play again(Yes/No)");
        return sc.next();
    }
    

}

public class GuessTheNumberGame {
    public static void main(String[] args) {
        String ans="yes";
        while(ans.equalsIgnoreCase("yes")){
            Game gg=new Game();
            boolean b=false;
            while(b==false){
                gg.takeUserInput();
                b=gg.checkUserInput();
        }
            ans=gg.playAgain();
    }
}}
