package com.company;

import java.util.Scanner;
// one more way to generate random number is
import java.util.Random;

// create a class game which allow the use to play "Guess the number" game once
// a number will be stored in the class, and you have to guess it
// if you guess it larger so the computer tells you that the number you guessed is larger than the number stored
// if you guess it smaller so the computer tell you that the number you guessed is smaller that the number stored
// generate functions such as takeUserInput, isCorrectNumber etc
// generate variables such as numberOfGuesses etc

class game1{
    // calling a class
    Random rand = new Random();
    int number = rand.nextInt(100);   //this method also generates a random number between 0 and 100
    int num;
    int numberOfGuesses = 10;
    final int fNumber;
    // int number= (int)(Math.random()*100);
    public game1(){
        fNumber = number;
        // System.out.println(number);
    }
    public void takeUserInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number: ");
        num = scan.nextInt();
    }
    public void isCorrectNumber(){
        System.out.println("Wohoo! you guessed it right ");
    }
    public void isLargerNumber(){
        System.out.println("The number is larger than the number generated, please enter again ");
    }
    public void isSmallNumber(){
        System.out.println("The number is smaller than the number generated, please enter again! ");
    }
}
// this has no link with the exercise it was just with learning point of view
//class game2 extends game{    // inheritence example
//    public game2(int number) {
//        super(number);
//    }
//}
public class cwh_exercise3 {
    public static void main(String[] args) {
        System.out.println("Let's play the game GUESS THE NUMBER!");
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        game1 play = new game1();
        int j = 0;
        while(j<10){
            play.takeUserInput();
            if (play.num == play.fNumber){
                play.isCorrectNumber();
                break;
            }
            else if (play.num > play.fNumber){
                play.isLargerNumber();
            }
            else {
                play.isSmallNumber();
            }
            j++;
        }
        if (j == 10){
            System.out.println("Sorry you are out of chances! ");
        }

    }
}
