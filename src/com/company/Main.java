package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();
        System.out.println("\n");
        System.out.printf("%d + %d = %d",num1, num2 , (num1 +num2));
    }
}
