package com.company;

import java.util.Scanner;
public class SwitchCaseMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age=sc.nextInt();
        switch(age){
            case 18:
            System.out.println("ADULT");
            break;
            case 21:
            System.out.println("eleigible fpr drinking");
            break;
            default:
            System.out.println("Lessgooo");   }
            
        System.out.println("thanks forusing my code");
        sc.close();
    
    }

}
