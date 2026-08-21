package com.company.inheritance_static_polymorphism_encapsulation;

public class StaticBlock {
    static int a=4;
    static int b;
    int c=7;
    static{
        System.out.println("I am in a static block");

    }
    static class Test{
        int a=69;
        public void mais(){
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        StaticBlock obj=new StaticBlock();

    }
}
