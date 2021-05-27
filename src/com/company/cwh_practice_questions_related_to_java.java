package com.company;

import java.util.Scanner;

public class cwh_practice_questions_related_to_java {

    // question 1
    // print the multiplication table of any number x

    /*
    static void table(int a){
        for (int i=1; i<=10; i++){
            int ans = a*i;
            System.out.printf("%d X %d = %d", a, i, ans);
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of which you want to print the table: ");
        int num = scan.nextInt();
        table(num);
    }
    */

    // question 2
    // a program to print the triangle of stars

    /*
    static void triangle(int a){
        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of one side: ");
        int num = scan.nextInt();
        triangle(num);
    }
    */

    // Question 3
    // recursive function to calculate the sum of first n natural numbers

    /*
    static int sum(int n){
        int result;
        if (n == 0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        else{
            result = n + sum(n-1);
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of numbers you want sum of: ");
        int num = scan.nextInt();
        System.out.printf("The sum of first %d number is: ", num);
        System.out.println(sum(num));
    }
    */
}
