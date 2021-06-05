package com.company;

// interface is the group of related methods with empty bodies
// in interface we use implement keyword to implement an interface
// the difference between interface and abstract class is that abstract classes can contain some non abstract methods
// whereas in interface all the methods are abstract, i.e. it is necessary to implement!
// It is necessary for you to override all the methods in an interface if you implement it in a class
// however it is not so for the abstract classes

interface bicycle{  //interface created
    void applyBrake(int decrement);      //first empty method
    void accelerate(int increment);      // second empty method
}
class heroCycle implements bicycle{
    int speed;
    public int getSpeed() {return speed;}
    public void setSpeed(int speed) {this.speed = speed;}
    public void applyBrake(int decrement){speed -= decrement;}
    public void accelerate(int increment){speed += increment;}
}

public class cwh_interface {
    public static void main(String[] args) {
        heroCycle badal = new heroCycle();
        badal.setSpeed(30);
        badal.applyBrake(12);
        System.out.println(badal.getSpeed());
    }
}
