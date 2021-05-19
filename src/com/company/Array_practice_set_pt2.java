package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Array_practice_set_pt2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //question 5
        //program to reverse an array
        /*
        System.out.println("Array no 1: ");
        int[] number = {21, 23, 24, 423, 43, 34, 34};
        int length = number.length;
        System.out.println(Arrays.toString(number));
        for (int i=0; i<length; i++){
            number[i] = number[length-i-1];
        }
        System.out.println(Arrays.toString(number));
        */

        //Question 7
        //program to find the minimum element of an array

        /*
        int[] array1 = {45, 89, 45, 36, 67, 32, 43, 89};
        int a = array1[0];
        for(int i =0; i<array1.length; i++){
            if(array1[i]<a){
                a = array1[i];
            }
        }
        System.out.println(a);
        */

        //Question 8
        // program to find whether the array is sorted or not

        /*
        System.out.println("The program to find out that the array is sorted or not");
        int[] array2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int sub = 0;
        int sum = 0;
        for (int i=0; i< (array2.length-1); i++){
            sub = array2[1] - array2[0];
            if ((array2[i+1] - array2[i])==sub){
                sum = sum + 1;
            }
        }
        if (sum == (array2.length-1)){
            System.out.println("The array is sorted.");
        }
        else{
            System.out.println("The array is not sorted.");
        }
        */
    }
}
