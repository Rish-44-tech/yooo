package com.company;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr= {201,345,456,781};
        int l=arr.length;
        int temp=0;
        for(int i=0;i<=l/2;i++){
            temp=arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;   }
        for(int element: arr){System.out.print(element+",");}
    }}
        