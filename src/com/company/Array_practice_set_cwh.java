package com.company;

import java.util.Scanner;

public class Array_practice_set_cwh {
    public static void main(String[] args) {
        // Chapter_6_practice_sets

        // Create an array of 5 floats and calculate their sum
        Scanner scan = new Scanner(System.in);
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
    }
}
