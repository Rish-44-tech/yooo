package com.company.inheritance_static_polymorphism_encapsulation;

public class Main {

    public static void main(String[] args) {
//        box old=new box(7);
//        box box=new box(old);
//        System.out.println(box.l+" "+box.w+" "+box.h);
//        final box x=new BoxWeight(1,1,1);
//        System.out.println(x.w+" "+x.h);
//        x.w=5;
//        System.out.println(x.w+" "+x.h);
        encapsulationExample x=new encapsulationExample();
        x.setB(4);
        x.setC(5);
        int p=x.getB();
        int q=x.getC();
    }
}
