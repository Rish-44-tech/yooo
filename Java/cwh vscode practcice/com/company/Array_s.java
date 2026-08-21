package com.company;
public class Array_s {
    public static void main(String[] args) {
    /*  int [] marks=new int[3];
        marks[0]=34;                        //M1: declaration and memory allocation together then initialization
        marks[1]=56;
        marks[2]=69;  */

    /*  int[] marks;
        marks=new int[2];                   //M2:declaration then allocation then initialization
        marks[0]=12;
        marks[1]=34;   */
     

        int[] marks={23,45,67};            //M3: declaration and initialization together
        System.out.println(marks[1]);
        System.out.println(marks.length);

        for(int i=0;i<marks.length;i++){System.out.println(marks[i]);} //print elements of array
        for(int i=marks.length-1;i>=0;i--){System.out.println(marks[i]);} //print elements of array in reverse

        for(int element: marks){System.out.println(element);}   //way to print elements of array in newer versions of java

    }
}
