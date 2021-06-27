package com.company;

// calculator which throws an exception

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "The Input you entered is invalid! ";
    }

    @Override
    public String getMessage() {
        return "Please try entering an integer number!";
    }
}
class CannotDivideByZeroException extends Exception{
    @Override
    public String toString(){
        return "Cannot Divide by zero";
    }

    @Override
    public String getMessage() {
        return "Please try entering a number other than zero! ";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString(){
        return "Number exceeds the highest number limit! ";
    }

    @Override
    public String getMessage() {
        return "Try entering a number smaller than 100,000 ";
    }
}
class MaxMultiplierReachedException extends Exception{
    @Override
    public String toString(){
        return "Number exceeds the max multiplier limit ";
    }

    @Override
    public String getMessage() {
        return "Try entering a number smaller than 7,000 ";
    }
}

public class cwh_exercise6_calculator {
    static int addition(int a, int b){
        return a + b;
    }
    static int subtraction(int a, int b){
        return a - b;
    }
    static int multiplication(int a, int b){
        return a * b;
    }
    static int division(int a, int b){
        return a / b;
    }
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Enter the first number (<7000 for multiplication): ");
            x = scan.nextInt();
            System.out.println("Enter the second number (<7000 for multiplication): ");
            y = scan.nextInt();
            if (x>100000 || y>100000){
                throw new MaxInputException();
            }
        }
        catch (MaxInputException e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
        System.out.println("Press - \n 1 for addition \n 2 for Subtraction \n 3 for multiplication \n 4 for Division \n");
        int calc = 0;
        // wrapping the input in a try catch in case the number entered is another than integer
        try{
            calc = scan.nextInt();
        }
        catch(InputMismatchException e){
            // e.printStackTrace();
            System.out.println(e.toString());
        }
        try{
            if (calc == 1){
                System.out.println(addition(x, y));
            }
            else if (calc == 2){
                System.out.println(subtraction(x, y));
            }
            else if (calc == 3){
                try{
                    if(x>7000 || y>7000){
                        throw new MaxMultiplierReachedException();
                    }
                    else{
                        System.out.println(multiplication(x,y));
                    }
                }
                catch (MaxMultiplierReachedException e){
                    System.out.println(e.toString());
                    System.out.println(e.getMessage());
                }
            }
            else if (calc == 4){
                try{
                    if(y==0){
                        throw new CannotDivideByZeroException();
                    }
                    else{
                        System.out.println(division(x, y));
                    }
                }
                catch(CannotDivideByZeroException e){
                    System.out.println(e.getMessage());
                    System.out.println(e.toString());
                }
            }
            else if (calc == 0){
                System.out.println("Number not entered! ");
            }
            else{
                throw new InvalidInputException();
            }
        }
        catch(InvalidInputException e){
            e.printStackTrace();
        }
    }
}
