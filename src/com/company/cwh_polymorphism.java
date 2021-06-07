package com.company;

// polymorphism is simply different types of a function, when we use a function or an interface in different scenarios so
// the term is referred to as polymorphism
interface intf1{
    void Method1();
    void Method2();
}
interface intf2{
    void Method3();
    void Method4();
}
class pre{
    public static void method(String name){
        System.out.println("Ok so you are " + name);
    }
}
class final1 extends pre implements intf1, intf2{
    public void Method1(){
        System.out.println("Method 1 --> intf1");
    }
    public void Method2(){
        System.out.println("Method 2 --> intf1");
    }
    public void Method3(){
        System.out.println("Method 3 --> intf2");
    }
    public void Method4(){
        System.out.println("Method 4 --> intf2");
    }
}
public class cwh_polymorphism {
    public static void main(String[] args) {
//        intf1 obj = new final1();
//        obj.Method1();
        final1 obj = new final1();
        obj.method("Hariom");
        obj.method("Piyush");
    }
}
