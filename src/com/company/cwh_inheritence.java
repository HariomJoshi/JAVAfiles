package com.company;

/*class animals{
    private int legs;
    private int eyes;
    private String hairs;
    String name;
    public animals(){
        System.out.println(" I am a base class constructor: ");
    }
    public animals(int a){
        System.out.println(" I am a base class constructor with the input of the argument " + a);
    }
    public animals(int b, int c){
        System.out.printf(" I am a base class constructor with the input of the argument %d and %d ", b,c);
        System.out.println();
    }
    public void legs(int a){
        System.out.println("Main legs wala method hoon! " + a);
    }
}
class cat extends animals{
    int obedience;
    public cat(int obedience_level){
        super(12, 23);           // to call the constructor of the base with some argument
        obedience = obedience_level;
    }
    public void legs(){
        System.out.println("Main legs wala method hoon! ");
    }
}
public class cwh_inheritence {
    public static void main(String[] args) {
        // animals rohit = new animals();
        cat meow = new cat(2);
        System.out.println(meow.obedience);
    }
}*/

// constructors in inheritance in java
// when you make a constructor in base class so it will also run first in the derived or extended class
// In the base class also, constructor from the base class will run first, and then the derived class
// If you have overloaded constructor in the base class so by default java will run the one with no arguments
// If you want to run the one with argument so you will have to use SUPER keyword
// THIS is also a keyword which is usually used to refer any variable inside a class

// method overriding in JAVA

class  class1{
    public int a;
    public static int method1(){
        return 12;
    }
    public void method2(){
        System.out.println("This is the second method: ");
    }
}
class class2 extends class1{
//    @Override // this annotation is used to make sure that method overriding is going on, it throws an error when method overriding in not going on
//    public void method2(){
//        System.out.println("This is the second method of class2: ");
//    }
    public void method3(){
        System.out.println("This is the third method method: ");
    }
}
public class cwh_inheritence {
    public static void main(String[] args) {
        class1 hariom = new class1();
        hariom.method2();
        class2 piyush = new class2();
        piyush.method2();
        System.out.println(piyush.method1());
    }
}