package com.company.interfaces;

public class car implements engine,Brake{

    @Override
    public void brake() {
        System.out.println("i brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("i start like a normal car");

    }

    @Override
    public void stop() {
        System.out.println("i stop like a normal car");
    }

    @Override
    public void accelerate() {
        System.out.println("i accelerate like a normal car");
    }
    static void s(){
        System.out.println("statix");
    }
}
