package com.company;

// Question 1
class goodMorning implements Runnable{
    @Override
    public void run(){
        int i = 1;
        while(i<45){
            System.out.println("Good Morning! ");
            i++;
        }
    }
}
class welcome implements Runnable{
    @Override
    public void run(){
        try{
            Thread.sleep(200);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        int i = 1;
        while(i<45){
            System.out.println("Welcome Bhai! ");
            i++;
        }
    }
}
public class cwh_threadsPS {
    public static void main(String[] args) {
        goodMorning obj1 = new goodMorning();
        welcome obj2 = new welcome();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
}
