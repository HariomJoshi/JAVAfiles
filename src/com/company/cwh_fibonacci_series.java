package com.company;

public class cwh_fibonacci_series {
    static void fib(int n){
        int i=0;
        int a = 1;
        int b = 1;
        System.out.println("0");
        System.out.println("1");
        System.out.println("1");
        while (i<=(n-2)){
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            i++;
        }
    }
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the number of digits in Fibonacci sequence you want to print: ");
        // int num = scan.nextInt();
        fib(23);
    }
}
