package com.company;

class circle{
    private int radius;
    private int perimeter;
    private int area;
    void setRadius(int r){
        this.radius=r;
    }
    void setPerimeter(int p){
        if(p==(2*22*radius)/7){this.perimeter=p;}
        else{System.out.println("INVALID PERIMETER");}
    }
    void setArea(int a){
        if(a==(22*radius*radius)/7){this.area=a;}
        else{System.out.println("INVALID AREA");}
    }
    int getRadius(){
        return radius;
    }
    double getPerimeter(){
        return perimeter;
    }
    double getArea(){
        return area;
    }
    
}
public class GettersAndSetters{
    public static void main(String[] args) {
        circle c= new circle();
        c.setRadius(7);
        System.out.println("Radius is "+c.getRadius());
        c.setPerimeter(44);
        System.out.println("Perimeter="+c.getPerimeter());
        c.setArea(164);
        System.out.println("area="+c.getArea());
      
    }   





}