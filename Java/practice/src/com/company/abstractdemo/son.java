package com.company.abstractdemo;

public class son extends parent{
    @Override
    void career(String name){
        System.out.println("I will become a "+name);
    }
    @Override
    void partner (String name,int age){
        System.out.println("I love "+name+". She is "+age);
    }
    void normal(int x){
        super.normal();
        System.out.println(x+x*3);
    }
}
