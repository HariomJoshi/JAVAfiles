package com.company;

import java.util.Scanner;

public class cwh_methods_in_java {
    // method invocation using object creation
    static int sub_and_mod(int a, int b){
        int c;
        if (a<b){
            c = b - a;
        }
        else{
            c = a -b;
        }
        return c;
    }
    public static void main(String[] args){
        // cwh_methods_in_java obj = new cwh_methods_in_java();
        // Scanner scan = new Scanner(System.in);
        System.out.println(sub_and_mod(21, 32));
    }
}