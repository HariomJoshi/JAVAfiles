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

    // Question 4
    // same as question 2 but the triangle must be opposite, so simply there will be decrementing for loop

    // Question 5
    // To print the n'th term of Fibonacci sequence using recursion

    /*
    static int nfib(int n){
        int result;
        if (n == 1){
            result = 0;
        }
        else if (n == 2){
            result = 1;
        }
        else{
            result = nfib(n-1) + nfib(n-2);
        }
        retu\rn result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the term which you want to know: ");
        int nterm = scan.nextInt();
        System.out.println(nfib(nterm));
    }
    */

    // question 6
    // find average of a set of numbers passed as arguments

    /*
    static int average(int ...arr){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        int result = sum/arr.length;
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many number you want to enter? ");
        int num = scan.nextInt();
        System.out.println("Enter the number one by one: ");
        int[] array1 = new int[num];
        for (int i=1; i<=num; i++){
            System.out.printf("Number %d: ", i);
            array1[i-1] = scan.nextInt();
        }
        System.out.println("The average of the above numbers is: "+ average(array1));
    }
    */

    // question 7
    // repeat 4 using recursion
    // we have to form and inverted triangle of stars

    static String triangle(int a){
        // harry has simply used one for loop in this condition
        String b = "*";
        String result;
        if(a == 1){
            // base condition of recursion, if it is not present so the recursion will never terminate so it is very important to add a base condition
            result =  b;
        }
        else{
            result = b + triangle(a-1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of each side: ");
        int num = scan.nextInt();
        System.out.println(triangle(num));
    }
}

// recursive functions are very useful in some conditions when we have to fit a mathematical formula for eg -
// sum(n) = 1 + 2 + 3 + 4 + 5 + ....... + n
// sum(n) = 1 + 2 + 3 + 4 + 5 + ....... + (n-1) + n
// sum(n) = sum(n-1) + n
// So using this technique it is very easy sometimes to just put something in a particular formula
