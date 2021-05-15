package com.company;

import java.util.Scanner;

public class Array_practice_set_cwh {
    public static void main(String[] args) {
        // Chapter_6_practice_sets

        // Create an array of 5 floats and calculate their sum
        Scanner scan = new Scanner(System.in);
        /*
        float[] fArray = new float[5];
        int sum = 0;
        for(int i=0; i<5; i++){
            System.out.printf("num %d: ", i);
            float input = scan.nextFloat();
            fArray[i] = input;
            sum += input;
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The array is as follows: ");
        for (int j=0; j<5; j++){
            System.out.println(fArray[j]);
        }
        */

        //a program to find out whether the integer is present in the array or not

        int[] randomArray = new int[5];
        for(int i=0; i<5; i++){
            System.out.printf("num %d: ", (i+1));
            int input = scan.nextInt();
            randomArray[i] = input;
        }
        System.out.print("Enter any random number: ");
        int inNumber = scan.nextInt();
        int num=0;
        for (int j=0; j<5; j++){
            if (randomArray[j]==inNumber){
                System.out.println("The Array contains the number you entered!");
                num =1;
            }
        }
        if (num == 0){
            System.out.println("The Array does not contain the number you entered!");
        }
    }
}
