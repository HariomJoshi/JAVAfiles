package com.company;

// Question 1
// creating class cylinder and using getters and setters to set its radius and height

/*
class cylinder{
    int height;
    int radius;
    int volume;
    int surfaceArea;
    public cylinder(int new_radius, int new_height){
        radius = new_radius;
        height = new_height;
    }
    // height setter
    public void setHeight(int new_height){
        height = new_height;
    }
    //radius setter
    public void setRadius(int new_radius){
        radius = new_radius;
    }
    // radius getter
    public int getRadius(){
        return radius;
    }
    // height getter
    public int getHeight(){
        return height;
    }
    // volume getter
    public int getVolume(){
        volume = (int)(3.14 * radius * radius * height);
        return volume;
    }
    // surface area getter
    public int getSurfaceArea(){
        surfaceArea = (int)(3.14 * 2 * radius * height);
        return surfaceArea;
    }
}
public class cwh_chapter9_practiceSet {
    public static void main(String[] args) {
        cylinder gas = new cylinder(9, 14);
        // gas.setRadius(21);
        // System.out.println(gas.getRadius());
        // gas.setHeight(12);
        System.out.println(gas.getVolume());
    }
}
*/


// Question 2
// use 1 to calculate surface are and volume of the cylinder

// Question 3
// Use a constructor and repeat 1

// Question 4
// overload a constructor to initialize a rectangle of length 4 and breadth 5 for using custom parameters
/*
class rectangle{
    int length;
    int breadth;
    public rectangle(){
        length = 4;
        breadth = 5;
    }
    public rectangle(int changed_length, int changed_breadth){
        length = changed_length;
        breadth = changed_breadth;
    }
    public int getArea(){
        return length * breadth;
    }
    public int getPerimeter(){
        return 2*(length * breadth);
    }
}
class cwh_chapter9_practiceSet{
    public static void main(String[] args) {
        rectangle football_field = new rectangle(43, 23);
        System.out.println(football_field.getArea());
    }
}
*/

// Question 5
// Repeat 1 for a sphere
// the formula of volume and surface would be changed
// there will be no variable as height
// These minimal changes will fulfill our objectives