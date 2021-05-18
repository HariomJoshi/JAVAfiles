package com.company;

import java.util.Scanner;

public class Array_practice_set_cwh {
    public static void main(String[] args) {
        // Chapter_6_practice_sets

        //Program #1
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

        //Program #2
        //a program to find out whether the integer is present in the array or not

        /*
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
        */

        // program #3
        // calculating average from an array of all the marks of physics

        /*

        int[] marks = {32, 34, 34, 45, 33, 22, 32}; //A random array
        int sum = 0;                                //declaration and initialization
        for (int number: marks){
            sum += number;
        }
        System.out.println("The average marks is: " + sum/marks.length);

        */
        // a program to add 2 matrices of size 2 X 3

        System.out.println("Enter the rows: ");
        int rows = scan.nextInt();
        System.out.println("Enter the columns: ");
        int columns = scan.nextInt();
        for (int i=0; i<rows; i++){
            System.out.printf("Matrix number %d" , i);
            for (int j=0; j<columns; j++){

           }
        }
    }
}
