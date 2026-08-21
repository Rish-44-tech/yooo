package com.company.accesscontrol;

public class A {
    protected static int member;
    public A(int x){
        member=x;
    }
    void q(){
        B.member=69;
    }

}
