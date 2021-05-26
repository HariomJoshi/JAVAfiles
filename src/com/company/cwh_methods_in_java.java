package com.company;

import java.util.Scanner;

public class cwh_methods_in_java {
    // function for varargs
    /*
    static int sum(int ...arr){
        int result = 0;
        for (int a:arr){
            result += a;
        }
        return result;
    }
    */
    //function for recursion
    // when a function call itself in java it is called recursion
    // factorial 0 = 1
    // factorial 1 = 1
    // keeping these two things in mind we have to write an if statement
    static int factorial(int a){
        if (a==0||a==1){
            return 1;
        }
        else{
            return a * factorial(a-1);
        }
    }
    // method invocation using object creation
    /*int sub_and_mod(int a, int b){
        int c;
        if (a<b){
            c = b - a;
        }
        else{
            c = a -b;
        }
        return c;
    }*/
    // factorial using recursion
    static int factorial_recursion(int x){
        int fact = 1;
        for (int i = 1; i<=x; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args){
        // cwh_methods_in_java object /*name of the object*/= new cwh_methods_in_java();
        // System.out.println(object.sub_and_mod(12, 32));
        // Scanner scan = new Scanner(System.in);
        // varargs
        // System.out.println("Varargs tutorial starts here");
        System.out.println(factorial_recursion(5));

    }
}