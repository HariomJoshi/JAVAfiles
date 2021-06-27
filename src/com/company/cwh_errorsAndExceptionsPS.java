package com.company;

import java.util.Scanner;

class MaxTriesError extends Exception{
    @Override
    public String getMessage() {
        return "Max tries is 5! ";
    }
    @Override
    public String toString() {
        return "Max tries reached! ";
    }
}
class cwh_errorsAndExceptionsPS {

    // function for question 3

    public static void finalFunc(int num){
        int sum = num;
        int[] randArray = {21, 32, 54, 41, 29, 30, 67};
        System.out.println("Enter the index of the number you want to print! ");
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        try{
            System.out.println(randArray[index]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e);
            sum += 1;
            System.out.println(sum);
            if (sum == 5){
                // System.out.println("Error! ");
                try {
                    throw new MaxTriesError();
                } catch (Exception e1) {
                    System.out.println(e1.toString());
                    System.out.println(e1.getMessage());
                }
            }
            else{
                finalFunc(sum);
            }
        }
    }
    public static void main(String[] args) {

        //syntax error

        // System.out.Println("This is the syntax error! ");

        // logical error
        // any sort of error which executes and the compiler is not able to identify,
        // but the program does not behave in the way we want it to

        // Runtime error
        // also called exception
        /*int a = 21;
        int i = 0;
        while (i<10){
            System.out.println(a/i);
            i++;
        }*/
        // -- the program shows an error because 21 is not divisible by zero and hence it is an exception,
        // leaving zero as a value of i the remaining program runs well

        // problem 2

        // haha --> arithmetic exception
        // hehe --> illegal argument function
        /*Scanner scan = new Scanner(System.in);
        try{
            // System.out.println(12/0); // arithmetic exception
            System.out.println("Enter any number! ");
            int a; // enter a string to get an illegal argument error
        }
        catch (ArithmeticException e){
            System.out.println("haha");
        }
        catch (IllegalArgumentException e){
            System.out.println("hehe");
        }*/

        // problem 3
        // program keeps accessing an array until a valid index is given
        // max tries --> 5

        finalFunc(0);

        // problem 4
        // Throw a custom exception when max tries are reached --> MaxTriesError


    }
}