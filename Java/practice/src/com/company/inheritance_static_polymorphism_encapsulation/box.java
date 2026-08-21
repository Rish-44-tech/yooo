package com.company.inheritance_static_polymorphism_encapsulation;

public class box {
    double h;
    private final double l;
    double w;
//    box(){
//        System.out.println("I am in constructor of box with no argument");
//        this.h=-1;
//        this.l=-1;
//        this.w=-1;
//    }
    //cube
    box(double side){
        System.out.println("I am in constructor of box with 1 argument");
        this.h=side;
        this.l=side;
        this.w=side;
    }
    //random
    box(double l,double w,double h){
        System.out.println("I am in constructor of box with 3 arguments");
        this.h=h;
        this.l=l;
        this.w=w;
    }
    box(box old){
        System.out.println("I am in constructor of box with old box as argument");
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }
    public void info(){
        System.out.println("running the box");
    }

}
class BoxWeight extends box{
    double weight;
    final double w;
    BoxWeight(double l, double w,double h){
        super(l,w,h);
        System.out.println("I am in constructor of Subclass BoxWeight");
        this.weight=-9;
        this.w=56;
        super.w=0;
        super.h=34;
        this.h=36;
    }

}
