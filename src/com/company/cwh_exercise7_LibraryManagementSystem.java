package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



class functions{

    public ArrayList<String> bookName = new ArrayList<>();
    public ArrayList<String> authorName = new ArrayList<>();
    public ArrayList<String> issuedTo = new ArrayList<>();
    public ArrayList<Date> issuedOn = new ArrayList<>();

    public void initiator(){
        // initiating the bookName list
        bookName.add("Book 1");
        bookName.add("Book 2");
        bookName.add("Book 3");
        bookName.add("Book 4");
        bookName.add("Book 5");
        bookName.add("Book 6");
        bookName.add("Book 7");
        bookName.add("Book 8");
        bookName.add("Book 9");
        bookName.add("Book 10");

        // initiating the author name list
        authorName.add("Author 1");
        authorName.add("Author 2");
        authorName.add("Author 3");
        authorName.add("Author 4");
        authorName.add("Author 5");
        authorName.add("Author 6");
        authorName.add("Author 7");
        authorName.add("Author 8");
        authorName.add("Author 9");
        authorName.add("Author 10");

        // Since no books are issued at the start so we are assuming all the blocks of issuedTo and issuedOn as null
        for (int i = 0; i< bookName.size(); i++){
            issuedTo.add(i, null);
        }
        for (int i = 0; i< bookName.size(); i++){
            issuedOn.add(i, null);
        }
    }


    // instantiating the above class
    Calendar calendar = Calendar.getInstance();
    Date date = calendar.getTime();

    // to add books
    public void addBooks(String BookName,String BookAuthor){
        bookName.add(BookName);
        authorName.add(bookName.indexOf(BookName), BookAuthor);
        issuedTo.add(bookName.indexOf(BookName), null);
        issuedOn.add(bookName.indexOf(BookName), null);
        System.out.println("Successfully added to the library! ");
    }

    // the following function is to remove any book --> working fine
    public void removeBooks(int index){
        bookName.remove(index);
        authorName.remove(index);
        issuedTo.remove(index);
        issuedOn.remove(index);
    }

    // to print currently available books  --> working fine
    public void printAvailableBooks(){
        for (int i = 0; i<bookName.size(); i++){
            System.out.printf("%d. %s by %s\n",(i+1),bookName.get(i),authorName.get(i));
        }
    }

    //to issue a book --> working fine
    public void issueBook(int index, String name){
        // trying to solve the problem by if else
        if (issuedOn.get(index) == null || issuedTo.get(index) == null){
            issuedOn.add(index, date);
            issuedTo.add(index, name);
            System.out.println("Book issued! ");
        }
        else {
            System.out.println("Sorry, the book has already been issued to "+ issuedTo.get(index) + " on " + issuedOn.get(index));
        }
    }

    //function to return book --> working fine
    public void returnBook(int index){
        if(issuedOn.get(index) != null || issuedTo.get(index) != null){
            issuedOn.add(index, null);
            issuedTo.add(index, null);
            System.out.println("Book Returned! ");
        }
        else{
            System.out.println("The book was never issued! ");
        }

    }

    // the following function prints the info of the books
    public void printInfo(int index){
        // wrapping with try catch just for protection
        try{
            System.out.println("Book: " + bookName.get(index));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        // wrapping with try catch just for protection
        try{
            System.out.println("Author: " + authorName.get(index));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        // wrapping with try catch to catch the error in case the book has not been issued to anyone yet
        try{
            System.out.println("Issued to: " + issuedTo.get(index));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("The book has not been issued to anyone yet! ");
        }
        // wrapping with try catch to catch the error in case the book has not been issued to anyone yet
        try{
            System.out.println("Issued on: " + issuedOn.get(index));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Issued date not available! ");
        }
    }
}

public class cwh_exercise7_LibraryManagementSystem {

    public static void switchCase(){
        functions fn = new functions();
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine();
        switch (num) {
            case 1 -> { // function to add book
                System.out.print("Book Name: ");
                String bookName = scan.nextLine();
                System.out.print("\nBook Author: ");
                String bookAuthor = scan.nextLine();
                fn.addBooks(bookName, bookAuthor);
                fn.printAvailableBooks();
            }
            case 2 -> { // function to remove books
                System.out.println("Following books are currently in the library! ");
                fn.printAvailableBooks();
                System.out.println("Which one you want to remove?(Write the number)");
                int num1 = scan.nextInt();
                fn.removeBooks((num1 - 1));
                fn.printAvailableBooks();
            }
            case 3 -> { // function to issue book
                fn.printAvailableBooks();
                System.out.println("Which one you want to issue?(Enter the number) ");
                int num2 = scan.nextInt();
                scan.nextLine();
                System.out.print("Please enter your name: ");
                String name = scan.nextLine();
                fn.issueBook(num2 - 1, name);
            }
            case 4 -> { // function to return book
                fn.printAvailableBooks();
                System.out.print("Which book you want to return (Enter the Index): ");
                int num3 = scan.nextInt();
                fn.returnBook(num3 - 1);
            }
            case 5 -> {// function to get info about a particular book
                fn.printAvailableBooks();
                System.out.println("Enter the number to get the info: ");
                int num4 = scan.nextInt();
                fn.printInfo(num4 - 1);
            }
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        functions fn = new functions();
        fn.initiator();
        System.out.println("What do you want to do? \n1. Add Book\n2. Remove Book\n3. Issue Book\n4. Return Book \n5. Want Info");
        switchCase();
        // if the user wants to do something else, the function is (this is where recursive function is used)
        System.out.println("Do you want to do something else?\n 1--> yes \n 2--> no");
        int num4 = scan.nextInt();
        if (num4 == 1) {
            System.out.println("What do you want to do? \n1. Add Book\n2. Remove Book\n3. Issue Book\n4. Return Book \n5. Want Info");
            switchCase();
        } else {
            System.out.println("Fine! ending the program...");
        }
    }
}
