package com.company;

// access modifiers
// tells us where the property/method is accessible
// different types of access modifiers are - private - default - protected - public
// we can set private variable through methods but not directly

// practice question
// make a class circle and set its variables like area and radius and give warning if the area and perimeter is being setted wrongly

/*
class circle{
    String name;
    private int radius;
    private int perimeter;
    private int area;
    public void setRadius(int changedRadius){
        radius = changedRadius;
    }
    public int getRadius(){
        return radius;
    }
    public void setName(String changedName){
        name = changedName;
    }
    public String getName(){
        return name;
    }
    public void setPerimeter(int newPerimeter){
        perimeter = newPerimeter;
        if (perimeter != (int)(2*(3.14)*radius)){
            System.out.println("The perimeter you are trying to enter is not correct! Please try again ");
        }
    }
    public int getPerimeter(){
        return perimeter;
    }
    public void setArea(int newArea){
        area = newArea;
        if (area != (int)((3.14)*radius*radius)){
            System.out.println("The area you are trying to enter is not correct! Please try again ");
        }
    }
    public int getArea(){
        return area;
    }

}
public class cwh_chaper9 {
    public static void main(String[] args) {
        circle ground = new circle();
        ground.setName("Hariom's ground");         // sets the name of the ground
        // System.out.println(ground.getName());      // gets the name of the ground
        ground.setRadius(7);
        ground.setArea(153);                // setting the area(not 154 because parsing picks ups the integer instead of rounding off
        ground.setPerimeter(44);          // setting the perimeter
    }
}
*/

// constructors in java
// a member funcion used to initialize an object while creating it
// it a function with a same name as class in which it is made, so when we instantiate the class so constructor gets invoked automatically
// constructors can be overloaded
// a constructor is not a method, if a method returns something it is no longer a constructor

/*
class thisemployee{
    String name;
    int id;
    public thisemployee(){
       name = "Hariom Joshi";
       id = 5740;
    }
    public thisemployee(String changed_name, int changed_id){
        name = changed_name;
        id = changed_id;
        // there mustn't be any return statement in constructor
    }
    public thisemployee(String changed_name){
        name = changed_name;
    }
    public thisemployee(int changed_id){
        id = changed_id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
}
public class cwh_chaper9 {
    public static void main(String[] args) {
        thisemployee hariom = new thisemployee("Piyush Joshi", 4323);
        System.out.println(hariom.getName());
        System.out.println(hariom.getId());
    }
}
*/
