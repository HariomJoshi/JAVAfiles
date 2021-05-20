package com.company;

import java.util.Scanner;

public class cwh_methods_in_java {
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
        // Scanner scan = new Scanner(System.in);
        System.out.println(sub_and_mod(21, 32));
    }
}
