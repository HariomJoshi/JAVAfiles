package com.company;

// question 1
// create class circle and use inheritance to create another class circle

class circle{
    int radius;
    public int getRadius(){
        return radius;
    }
    public void setRadius(int new_Radius){
        this.radius = new_Radius;
    }
    public int getarea(){
        return (int)(3.14 * radius * radius);
    }
}
class cylinder extends circle{
    int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public int getarea(){
        return (int)((3.14 * radius * radius) *2 + (2 * 3.14 * radius * height));
    }
    public int getVolume(){
        return (int)(3.14 * radius * radius * height);
    }
}
public class cwh_chapter10PS {
    public static void main(String[] args) {
        circle objC = new circle();
        cylinder obj = new cylinder();
        obj.setHeight(12);
        objC.setRadius(3);
        //System.out.println(obj.getHeight());
        System.out.println(obj.getVolume());
    }
}

// question 2
// Question 2 is same as  question 1

// question 3
// create Methods for area and volume in 1

// wuestion 4
// question 4 is same as question 3

// question 5
// the constructor execution is as follows - base -> derived 1 -> derived 2
// constructor of base class will be executed first


