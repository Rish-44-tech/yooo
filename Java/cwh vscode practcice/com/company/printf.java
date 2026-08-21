package com.company;
import java.util.Scanner;
public class printf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("num1 =");
        int num1 =sc.nextInt();
        System.out.println("num 2 =");
        float num2=sc.nextFloat();
        System.out.format("The numbers received are %d and %5.1f",num1,num2);
        // 5.1f means output uses 5 places and only 1 number after decimal
        
       sc.close();
    }
}
