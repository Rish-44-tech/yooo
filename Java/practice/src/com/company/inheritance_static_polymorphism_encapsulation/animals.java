package com.company.inheritance_static_polymorphism_encapsulation;

public class animals {
    int num;
    animals name(){
        System.out.println("i am in animals superclass");
        return this;
    }

    @Override
    public String toString() {
        return "animals{" +
                "num=" + num +
                '}';
    }
}
class dog extends animals{
    String dog;
    @Override
    dog name(){
        System.out.println("i am in dogs subclass");
        return this;
    }

    @Override
    public String toString() {
        return "dog{" +
                "dog='" + dog + '\'' +
                '}';
    }
}
class Ma1n{
    public static void main(String[] args) {
        animals a=new animals();
        a.name();

        dog d=new dog();
        d=d.name();

        animals d1=new dog();
        d1=d1.name();
        System.out.println(a+" "+d+" "+d1);
    }
}