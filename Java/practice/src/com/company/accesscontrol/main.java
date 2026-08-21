package com.company.accesscontrol;

public class main extends access{
    public main(int x,String a) {
        super(x, a);
    }
    protected void x(){
        System.out.println(a());
    }

    public static void main(String[] args) {
        main m=new main(1,"a");
        access p=new main(1,"23");
        A e=new A(23);
        B f=new B();
        e.q();
        System.out.println(B.member);
    }
    }

