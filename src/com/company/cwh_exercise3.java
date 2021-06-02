package com.company;

import java.util.Scanner;

// create a class game which allow the use to play "Guess the number" game once
// a number will be stored in the class, and you have to guess it
// if you guess it larger so the computer tells you that the number you guessed is larger than the number stored
// if you guess it smaller so the computer tell you that the number you guessed is smaller that the number stored
// generate functions such as takeUserInput, isCorrectNumber etc
// generate variables such as numberOfGuesses etc

class game{
    int numberOfGuesses = 10;
    final int fNumber;
    public game(int number){
        fNumber = number;
    }
    public void takeUserInput(){
        System.out.println("Enter the number: ");
    }
    public void isCorrectNumber(){
        System.out.println("Wohoo! you guessed it right ");
    }
    public void isLargerNumber(){
        System.out.println("The number is larger, please enter again ");
    }
    public void isSmallNumber(){
        System.out.println("The number is small, please enter again! ");
    }
}
class game2 extends game{    // inheritence example

    public game2(int number) {
        super(number);
    }
}
public class cwh_exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        game play = new game2(23);
        int j = 0;
        while(j<10){
            play.takeUserInput();
            int num = scan.nextInt();
            if (num == play.fNumber){
                play.isCorrectNumber();
                break;
            }
            else if (num > play.fNumber){
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
