package com.company;

// just and example interface
interface Demo{
    int meth1(int number);
    void meth2();
}

// making a functional interface to demonstrate Lambda Expressions
interface DemoInterface{
    void meth1(int a , int b);
}

public class cwh_anonymousClasses_and_lambdaExpressions {
    public static void main(String[] args) {
        Demo obj = new Demo() {  // instantiating an anonymous class
            @Override
            public int meth1(int number) {
                System.out.println("This is method 1 and it also returns something! ");
                return number;
            }

            @Override
            public void meth2() {
                System.out.println("This is method 2 and it returns nothing! ");
            }
        }; // to end the anonymous class
        obj.meth1(21);  // calling the function
        System.out.println(obj.meth1(11));

        //lambda expressions
        // the above method can also be dome as follows
        System.out.println("The result of Lambda Expressions is as follows - ");
        DemoInterface obj1 = (x,y)->{
            System.out.println("The numbers entered are " + x + "," + y);
        };
        obj1.meth1(21,32);
    }
}
