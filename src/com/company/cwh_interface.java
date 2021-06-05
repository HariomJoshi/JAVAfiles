package com.company;

// interface is the group of related methods with empty bodies
// in interface we use implement keyword to implement an interface
// the difference between interface and abstract class is that abstract classes can contain some non abstract methods
// whereas in interface all the methods are abstract, i.e. it is necessary to implement!
// It is necessary for you to override all the methods in an interface if you implement it in a class
// however it is not so for the abstract classes

interface bicycle{  //interface created
    int a = 12;      // you can create property in interface
    void applyBrake(int decrement);      //first empty method
    void accelerate(int increment);      // second empty method
}
interface bike{  //interface created
    void changeGear();
    void applyClutch();
}
class heroCycle implements bicycle, bike{
    int speed;
    public int getSpeed() {return speed;}
    public void setSpeed(int speed) {this.speed = speed;}
    public void applyBrake(int decrement){speed -= decrement;}
    public void accelerate(int increment){speed += increment;}
    public void changeGear(){
        System.out.println("Changing gear");
    }
    public void applyClutch(){
        System.out.println("Applying clutch to change the gear! ");
    }
}

public class cwh_interface {
    public static void main(String[] args) {
        heroCycle badal = new heroCycle();
        badal.setSpeed(30);
        badal.applyBrake(12);
        System.out.println(badal.getSpeed());
        badal.applyClutch();
        badal.changeGear();
    }
}

// multiple inheritance is not allowed in java because java has some better way to define things i.e. java says that
// it is better to achieve the same thing with the help of interfaces and not with classes
// properties in interfaces need not to be overwritten or implement, however you can overwrite them.
