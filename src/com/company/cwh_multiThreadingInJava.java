package com.company;

// multithreading increases speed
// since threads are lighter than process so the use significantly less resources
// chances to run out of resources are more in processes

// Given below is the example of Creating a thread by extending thread class

/*class thread1 extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("Running! ");
        }
    }
}
class thread2 extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("Running second thread!   ");
        }
    }
}
public class cwh_multiThreadingInJava {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        t1.start();
        thread2 t2 = new thread2();
        t2.start();
    }
}
// from the running of the above program we can clearly conclude
// that both the thread executes concurrently but not parallel
*/

// the following is the example of creating thread by implementation of runnable interface

/*class thread1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread 1 is successfully running..");
    }
}
public class cwh_multiThreadingInJava{
    public static void main(String[] args) {
        thread1 obj = new thread1();                // instantiating class
        Thread finalObj = new Thread(obj);          // putting the object of the class inside a thread
                                                    // it is a sort of format in the case of thread making through implementation
        finalObj.start();
    }
}*/

// constructors from thread class

class myThread implements Runnable{
    @Override
    public void run(){
        int i = 1;
        while(i<35){
            System.out.println("Thread one running, max priority! ");
            i++;
        }
    }
}
class myThread3 implements Runnable{
    @Override
    public void run(){
        int i = 1;
        while (i<35){
            System.out.println("Third thread with normal priority, it must be executed the least number of times");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
class myThread2 extends Thread{
    public myThread2(String name){
        super(name);
    }
    @Override
    public void run(){
        int i = 1;
        while (i<35){
            System.out.println("This is the second thread which has minimum priority");
            i++;
        }
    }
}
public class cwh_multiThreadingInJava {
    public static void main(String[] args) {
        myThread obj = new myThread();
        // Thread t1 = new Thread(obj);  // this is an example of Thread(runnable r) type constructor

        // Third thread
        myThread3 obj3 = new myThread3();
        Thread t3 = new Thread(obj3, "Hariom's third Thread");
        t3.setPriority(Thread.NORM_PRIORITY);
        t3.start();
        try{
            t3.join();
        }
        catch(Exception e){
            System.out.println(e);
        }

        // First thread
        Thread t1 = new Thread(obj, "Hariom's Thread");  // this is an example of Thread(runnable r, String name) type constructor
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(t1.getName());
        t1.setPriority(Thread.MAX_PRIORITY);

        // Second thread
        myThread2 t2 = new myThread2("Hariom's Second Thread");
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();

    }
}
// we can see from the above function that the thread with max priority is executed more number of times