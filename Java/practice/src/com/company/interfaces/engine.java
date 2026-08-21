package com.company.interfaces;

public interface engine {
    default void x(){
        System.out.println("engine x");
    }
    void start();
    void stop();
    void accelerate();
    final static int price=78000; //by default final and static so we didnt need to write it

}
