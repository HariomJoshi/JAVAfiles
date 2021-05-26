package com.company;

import java.util.Scanner;

public class cwh_method_overloading {
    /*static void telljoke(){
        System.out.println("Sorry! I have no joke to tell you
         right now! ");
    }*/

    //method overloading

    static void overloaded(){
        System.out.println("Here, the first method with the same name is being executed! ");
    }
    // same functions with different parameters
    static void overloaded(String a){
        System.out.println("Hello " + a + " dost! kaise ho?");
    }
    static void overloaded(String a, String b){
        System.out.println("Hello " + a + " and not " + b);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String x = scan.next();
        String y = scan.next();
        overloaded();
        overloaded(x);
        overloaded(y, x);

        /*System.out.println("The joke will keep running again and again until you order it not to! ");
        System.out.println("/n");
        while(true){
            telljoke();
            System.out.println("Have you read it? or you want to hear once more? ");
            System.out.println("Type 1 for yes and press any key to exit.");
            String ans = scan.next();
            if (ans.equals("1")){
                telljoke();
            }
            else{
                break;
            }
        }*/
    }
}