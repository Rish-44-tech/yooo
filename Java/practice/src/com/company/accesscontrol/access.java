package com.company.accesscontrol;

public class access {
    protected int num;
    String name;
    int[] arr;
    public access(int num,String name){
        this.num=num;
        this.name=name;
        this.arr=new int[num];
    }
    public int hashCode(){
        return this.num;
    }

    @Override
    public boolean equals(Object obj) {
        return this.name==((access)obj).name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    protected int a(){
        return (this.num*3);
    }


    public static void main(String[] args) {
        access a = new access(2,"r");
        access b=new access(2,"r");
        System.out.println();
    }
}
