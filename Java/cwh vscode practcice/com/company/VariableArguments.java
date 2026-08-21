package com.company;

public class VariableArguments {
    static void foo(){
        System.out.println("GM");
    }
    static int sum(int...arr){      // If we want atleast one argument, static int sum(int a,int...arr)
        //Arguments are available here as an array int[] arr
        int sum=0;
        for(int element:arr){
            sum+=element;}
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(3,5,6,7,8,12,34));
    }
  


    }


