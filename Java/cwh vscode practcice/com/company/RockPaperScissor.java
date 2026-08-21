package com.company;
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor {
    public static void main(String[] args) {
      while(true){
      Scanner sc=new Scanner(System.in);
      System.out.print("0 for Rock\n1 for Paper\n2 for Scissor\nEnter your move: ");
      int userinput=sc.nextInt();
      if(userinput==0){System.out.println("USER PLAYED ROCK");}
      else if(userinput==1){System.out.println("USER PLAYED PAPER");}
      else if(userinput==2){System.out.println("USER PLAYED SCISSOR");}
      else{System.out.println("INVALID USER INPUT");
           continue;}

      Random rand=new Random();
      int compinput=rand.nextInt(3);
      if(compinput==0){System.out.println("COMPUTER PLAYED ROCK");}
      else if(compinput==1){System.out.println("COMPUTER PLAYED PAPER");}
      else if(compinput==2){System.out.println("COMPUTER PLAYED SCISSOR");}

      if(userinput==compinput){System.out.println("tie");}
      if(userinput==0 && compinput==1 || userinput==2&&compinput==0||userinput==1&&compinput==2){System.out.println("COMPUTER WINS");}
      if(userinput==1 && compinput==0 || userinput==0&&compinput==2||userinput==2&&compinput==1){System.out.println("USER WINS");}
      
      System.out.println("DO YOU WANT TO PLAY MORE(YES/NO)");
      String ans=sc.next();
      if(ans.equalsIgnoreCase("YES")){continue;}
      else if(ans.equalsIgnoreCase("NO")){System.out.println("THANKS FOR PLAYING");
                                                        sc.close();                                                  
                                                        break;}
      else{System.out.println("INVALID ANSWER");
           sc.close(); 
           break;}  
    }
   }}