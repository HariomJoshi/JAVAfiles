package com.company;

// the following is the practice set of chapter 11
// question1
// create an abstract class pen with method write and refill as abstract methods
/*abstract class pen{
    public void print(){
        System.out.println("Pen has been instantiated! ");
    }
    abstract void write();
    abstract void refill();
}
// just for learning purpose
interface pen1{
    int b = 12;
    void write1();
    void refill1();
    default void print1(){
        System.out.println("This is it! ");
    }
}
class start extends pen implements pen1{
    // methods of method pen1
    public void write1(){
        System.out.println("Writing! ");
    }
    public void refill1(){
        System.out.println("refilling! ");
    }
    // methods of method pen
    public void write(){
        System.out.println("I am writing! ");
    }
    public void refill(){
        System.out.println("I am refilling myself! ");
    }
}
class fountainPen extends pen{
    // methods of method pen
    public void write(){
        System.out.println("writing");
    }
    public void refill(){
        System.out.println("refilling");
    }
    // a new methods (fountain pen specific)
    public void changeNib(){
        System.out.println("Changing the nib! ");
    }
}
public class cwh_ch11PS {
    public static void main(String[] args) {
//        start obj = new start();
//        obj.write();
//        obj.refill();
        start obj = new start();
//        obj.write();
//        obj.refill();
        fountainPen a = new fountainPen();
        a.changeNib();
//        a.write();
//        a.refill();

        //demonstration of polymorphism
        pen1 a1 = new start();
        // now as I've demonstrated below I can use the functions fo pen interface only.
        a1.write1();
        a1.refill1();
    }
}*/

// question 2
// use pen class for 1 to create another concrete class fountain pen with another method change nib

// question 3
// create class monkey with jump and bite methods
// create an interface basicAnimal with eat and sleep methods in it
// create a class humans and extend it with class monkey and implement basicAnimal interface in it

/*
abstract class Monkey{
    abstract void jump();
    abstract void bite();
}
interface basicAnimals{
    void eat();
    void sleep();
}
class humans extends Monkey implements basicAnimals{
    public void jump(){
        System.out.println("the monkey is jumping");
    }
    public void bite(){
        System.out.println("The monkey is biting");
    }
    public void eat(){
        System.out.println("The animals are eating");
    }
    public void sleep(){
        System.out.println("The animals are sleeping");
    }
}
public class cwh_ch11PS {
    public static void main(String[] args) {
        humans hariom = new humans();
        hariom.bite();
        hariom.sleep();
    }
}*/

// question 4
// create an abstract class telePhone with methods --> ring, lift and disconnect (abstract)
// create another class smartTelePhone and demonstrate polymorphism

/*abstract class telePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
interface camera1{
    void clickPics();
    void recordVideo();
}
interface gps{
    String getLocation();
    void setLocation(String new_address);
}
interface mediaPlayer{
    void playMusic();
    void stopMusic();
}
class smartTelePhone extends telePhone implements camera1, gps, mediaPlayer{
    // telephone functions
    @Override
    public void ring(){
        System.out.println("Ringing...");
    }
    @Override
    public void lift(){
        System.out.println("lifting...");
    }
    @Override
    public void disconnect(){
        System.out.println("Disconnecting...");
    }
    // camera functions
    @Override
    public void clickPics(){
        System.out.println("Clicking Pictures! ");
    }
    @Override
    public void recordVideo(){
        System.out.println("Recording Video! ");
    }
    // gps function
    String location;
    @Override
    public String getLocation(){
        return location;
    }
    @Override
    public void setLocation(String new_location){
        location = new_location;
    }
    // media player function
    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }
    public void stopMusic(){
        System.out.println("Stopping music");
    }
}
public class cwh_ch11PS {
    public static void main(String[] args) {
        gps GPS = new smartTelePhone();  // here we took the refrence of our interface gps and the object of our class smartTelePhone
        // In such conditions we can only access those properties or methods which are particularly present in gps interface
        // so for particular instance our smartTelePhone object works only as gps
        // so such existence of an object as different forms is known as polymorphism
        GPS.setLocation("Goral chaur Marg, champawat, Uttrakhand (262523)");
        System.out.println(GPS.getLocation());
        // similarly we can do with another interface or abstract class also
        // for example
        camera1 cam = new smartTelePhone();
        cam.clickPics(); // for this instance our smart Telephone is being used only as a camera and its work is also limited to
        // the camera only
    }
}*/

// question 6
// create an interface --> tvRemote
// use it to inherit another class --> smartTvRemote

import java.util.Scanner;

interface tvRemote{
    void switchOn();
    void switchOff();
    void changeChannel();
}
interface smartTvRemote extends tvRemote{
    void voiceSearch();
    int add(int a, int b);
    int sub(int a, int b);
    int into(int a, int b);
}
class Tv implements tvRemote{
    @Override
    public void switchOff() {
        System.out.println("Switching on the TV");
    }

    @Override
    public void switchOn() {
        System.out.println("Switching off the Tv");
    }
    @Override
    public void changeChannel(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Which channel you want to change to? ");
        int newChannel = scan.nextInt();
        System.out.println("Changing to channel " + newChannel);
    }
}
public class cwh_ch11PS {
    public static void main(String[] args) {
        Tv obj = new Tv();
        obj.changeChannel();
    }
}

// question 7
// create a class TV which implements tvRemote interface from Q6