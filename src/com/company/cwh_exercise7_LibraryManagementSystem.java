package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

class functions{
    public ArrayList<String> bookName = new ArrayList<>();
    public ArrayList<String> authorName = new ArrayList<>();
    public ArrayList<String> issuedTo = new ArrayList<>();
    public ArrayList<Date> issuedOn = new ArrayList<>();
    functions(){
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
        bookName.add(bookName.size(), BookName);
        authorName.add(bookName.indexOf(BookName), BookAuthor);
        issuedTo.add(bookName.indexOf(BookName), null);
        issuedOn.add(bookName.indexOf(BookName), null);
    }

    // check
    public void noOfAvailableBooks(){
        System.out.println(bookName.size());
    }

    // the following function is to remove any book
    public void removeBooks(int index){
        bookName.remove(index);
        authorName.remove(index);
        issuedTo.remove(index);
        issuedOn.remove(index);
    }

    // to print currently available books
    public void printAvailableBooks(){
        for (int i = 0; i<bookName.size(); i++){
            System.out.println(bookName.get(i) + " by " + authorName.get(i));
        }
    }

    //to issue a book
    public void issueBook(int index, String name){
        // trying to solve the problem by if else
        if (issuedOn.get(index) == null || issuedTo.get(index) == null){
            issuedOn.add(index, date);
            issuedTo.add(index, name);
        }
        else {
            System.out.println("Sorry, the book has already been issued to "+ issuedTo.get(index) + " on " + issuedOn.get(index));
        }
    }

    //function to return book
    public void returnBook(String BookName){

    }
    public void printInfo(int index){
        // wrapping with try catch just for protection
        try{
            System.out.println("The Book is " + bookName.get(index));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        // wrapping with try catch just for protection
        try{
            System.out.println("The author is " + authorName.get(index));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        // wrapping with try catch to catch the error in case the book has not been issued to anyone yet
        try{
            System.out.println("The book is issued to" + issuedTo.get(index));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("The book has not been issued to anyone yet! ");
        }
        // wrapping with try catch to catch the error in case the book has not been issued to anyone yet
        try{
            System.out.println("The book is issued on" + issuedOn.get(index));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Issued date not available! ");
        }
    }
}

public class cwh_exercise7_LibraryManagementSystem {
    public static void main(String[] args) {
        functions fn = new functions();
        fn.addBooks("An Indian Girl", "Chetan Bhagat");
        fn.addBooks("Wings of fire", "A.P.J. Abdul Kalam");
        // fn.printInfo(lb.bookName.indexOf("An Indian Girl"));
        System.out.println(fn.authorName.size());

    }
}
