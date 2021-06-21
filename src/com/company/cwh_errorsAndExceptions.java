package com.company;

import java.util.Scanner;

//first program

/*class myThread1 implements Runnable{
    public void run(){
        int sum = 0;
        int i = 0;
        while(i<10){
            try{
                int c = 25/i;
                System.out.println(c);
            }
            catch(Exception e){
                System.out.println("There is an error in the program! ");
                System.out.println(e);
                sum += 1;
            }
            i++;
        }

    }
    public void run(int x){
        int i = 0;
        while(i<10){
            try{
                int c = x/i;
                System.out.println(c);
            }
            catch(Exception e){
                System.out.println("There is an error in the program! ");
                System.out.println(e);
            }
            i++;
        }
    }
}*/

// second program

/*class arrayNew implements Runnable{
    int[] array = {21, 43, 34, 23, 32 ,23 ,53};

    public void run(){
        int res = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the index which you want to print! ");
        int integer = scan.nextInt();
        try{
            System.out.println("AAh! Now you did it right..");
            System.out.println("The number is "+ array[integer]);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e);
            res += 1;
        }
        if (res ==1){
            System.out.println("Please enter it right man! ");
            run();
        }
    }
}*/

class newException extends Exception{
    @Override
    public String toString(){
        return "Wrong number added";
    }
    @Override
    public String getMessage(){
        return "You should try entering a different number! ";
    }
}
class thisThread extends Thread{
    @Override
    public void run(){
        try{
            Thread.sleep(2000);
            System.out.println("Transfer successful! ");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
public class cwh_errorsAndExceptions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // first program

//        myThread1 obj = new myThread1();
//        Thread t1 = new Thread(obj);
//        t1.start();
//        obj.run(21);

        // second program

//        arrayNew obj = new arrayNew();
//        Thread t1 = new Thread(obj);
//        t1.start();

        // Third program
        thisThread t1 = new thisThread();
        System.out.println("Please Enter any number! ");
        int number = scan.nextInt();
        if(number < 0){
            try{
                throw new newException();
            }
            catch(Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        else{
            System.out.println("Yes you entered it right!, transferring to the database......");
        }
        t1.start();


    }
}
