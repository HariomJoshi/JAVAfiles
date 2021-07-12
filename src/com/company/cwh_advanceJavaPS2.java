package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


// question 1
// generate javaDoc using and without using intellij Idea
/*
/**
 * Contains normal methods such as add and subtract
 * @author Hariom
 * @see <a href = "https://www.google.com/">Google</a>
 * @deprecated
 *//*
public class cwh_advanceJavaPS2 {
    *//**
     * This method is to subtract two numbers
     * @author Hariom
     *//*
    public int sub( int a, int b){
        return a - b;
    }

    *//**
     * this method adds both the number and returns the sum
     * @author Hariom
     * @since 2002
     * @param a First number to be added
     * @param b Second number to be added
     * @return Returns the sum of both the numbers a and b
     *//*
    public int add(int a , int b){
        return a + b;
    }

    // starting the main method
    *//**
     *This is the main method and does nothing
     *//*
    public static void main(String[] args) {

    }
}
    */

    // question 2
    // create a class with deprecated annotation
    // by giving deprecated annotation to a class, all of its methods also become deprecated

    // question 3
    // suppress the generated warnings

    // Question 4
    // create an interface and generate an instance from it
/*interface inf{
    void meth();
    int meth1();
}

public class cwh_advanceJavaPS2 {

    public static void main(String[] args){
        inf interf = new inf() {
            @Override
            public void meth() {
                System.out.println("I am meth");
            }

            @Override
            public int meth1() {
                System.out.println("I am meth1");
                return 0;
            }
        }; // closing the instantiation, using semicolon to close the instantiation
    }
}*/

// Question 5
// Write a program to generate multiplication table of a given number and write it in a file

public class cwh_advanceJavaPS2 {
    public static String table(int a, int b){
        return (a + " X " + b + " = " + a*b + "\n");
    }

    public static void returnTable(int num2){
        // to produce a table
        for (int i = 2; i <= 9; i++) {
            // to write a file
            try{
                FileWriter fileWriter = new FileWriter("TableOf" + i +".txt");
                for (int j = 0; j<=num2; j++){
                    fileWriter.write(table(i, j));
                }
                fileWriter.close();
            }
            catch (IOException e) {
                System.out.println("Unable to write the file");
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //to create a new file
//        File file = new File("TableFile.txt");
//        try{
//            file.createNewFile();
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }

        returnTable( 10);

// done --> WOHOOO!
    }
}

