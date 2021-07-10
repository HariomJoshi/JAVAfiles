package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class cwh_fileHandlingInJava {
    public static void main(String[] args) {

        // the following method is to create a file

        /*File file = new File("random_file.txt");
        try{
            file.createNewFile();
        }
        catch (IOException e){
            System.out.println("Sorry! unable to make a file");
            e.printStackTrace();
        }*/

        // the following method is to write a file

        /*try{
            FileWriter fileWriter = new FileWriter("random_file.txt");
            fileWriter.write("This is the thing which I have written through file writer method!\n accha to hum chalte hain!  ");
            fileWriter.close(); // without this method the function wont work!
        }
        catch (IOException e){
            System.out.println("Unable to write a file! ");
            e.printStackTrace();
        }*/

        // the following method is to read a file

       /* File file1 = new File("random_file.txt");

        // surrounding by try catch in case some sort of error shows up
        try{
            Scanner scan = new Scanner(file1);
            while (scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
            scan.close();
        }
        catch (FileNotFoundException e){
            System.out.println(" File not found! ");
            e.printStackTrace();
        }*/

        // the following method is to delete a file

        File file = new File("random_file.txt");
        if(file.delete()){
            System.out.println("FIle deleted! ");
        }
        else{
            System.out.println("Unable to delete the file! ");
        }
    }
}
