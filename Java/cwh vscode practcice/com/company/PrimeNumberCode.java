package com.company;
import java.util.Scanner;
public class PrimeNumberCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("n= ");
        int n=sc.nextInt();
        boolean isPrime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime==true){System.out.println("PRIME");}
        else{System.out.println("NOT PRIME");}
        sc.close();

}}
