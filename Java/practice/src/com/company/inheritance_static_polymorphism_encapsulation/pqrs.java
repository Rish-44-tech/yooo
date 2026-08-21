package com.company.inheritance_static_polymorphism_encapsulation;

public class pqrs {
    Test p;

    public static void main(String[] args) {
        singleton obj=singleton.getInstance(19,"Rishit");
        singleton obj2=singleton.getInstance(21,"xyz");
        System.out.println(obj2.age+" "+obj2.name);

    }
}

class Test {
    String name = "abcde";

    public Test(String name) {
        this.name = name;
    }

    public void x() {
        System.out.println("hiyaa");
    }

    @Override
    public String toString() {
        return name;
    }
}
class singleton{
    int age;
    String name;
    private singleton(int a,String s){
        this.age=a;
        this.name=s;
    }
    private static singleton instance;
    public static singleton getInstance(int age, String name){
        if(instance==null){
            instance=new singleton(age,name);
        }
        return instance;
    }
}


