package com.company.interfaces;
import java.util.Scanner;

public class main extends car {
    public static void main(String[] args) {
        car car=new car();
        Brake.y();
        car.x();
        car.start();
        car.stop();
        car.accelerate();
        car.brake();
        System.out.println(engine.price);
        main.s();

        System.out.println("Enter name: ");
        Scanner x=new Scanner(System.in);
        String name=x.nextLine();
        System.out.println("My name is "+name);

    }
}
