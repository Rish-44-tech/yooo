package com.company;

class Student {
    int rno=87;
    String name="name not given";
    Student(int rno,String name){
        this.rno=rno;
        this.name=name;
    }
    Student(){}
}

public class Main {
	
    public static void main(String[] args) {
        Integer a=10;
        Integer b=20;
        swap(a,b);
        System.out.println(a+" "+b);
       
    
        Student s= new Student();

    }
 static void swap(Integer a, Integer b) {
            Integer temp = a;
            a = b;
            b = temp;
}}