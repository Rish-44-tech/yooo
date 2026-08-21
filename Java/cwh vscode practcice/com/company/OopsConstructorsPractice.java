package com.company;
class myMainEmployee{
    private int id;
    private String name;
    private int salary;

    public myMainEmployee(int myid,String myname,int mysalary){    //Constructor is a method without return value and same name as class. So, it behaves like method only but we dont need to call it. we can directly initialize object while creating it. Constructor can also do method overloading by having different parameters.
       this.id=myid;
       this.name=myname;
       this.salary=mysalary;}
    public myMainEmployee(){
        this.id=45;
        this.name="Your Name Here";
        this.salary=450000;
    }

    int getID(){
        return id;
    }
    String getName(){
        return name;
    }
    int getSalary(){
        return salary;
    }}
public class OopsConstructorsPractice {
    public static void main(String[] args) {
        myMainEmployee Rishit= new myMainEmployee(23,"RishJ",25000000);
        System.out.printf("My details are:\nID:%d\nName:%s\nSalary:%d\n",Rishit.getID(),Rishit.getName(),Rishit.getSalary());

        myMainEmployee John=new myMainEmployee();
        System.out.printf("My details are:\nID:%d\nName:%s\nSalary:%d",John.getID(),John.getName(),John.getSalary());

    }
}
