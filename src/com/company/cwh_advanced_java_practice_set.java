package com.company;

import java.sql.Time;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;

public class cwh_advanced_java_practice_set {
    public static void printArray(ArrayList<String> list){
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i)); // this prints the number in the list "list" of index 1
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // question 1

        // create an arrayList and store the names of students inside it, print it using a for loop
        /*ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter the student names one by one: ");
        for (int i = 0; i<10; i++){
            System.out.printf("Student %d : ", i+1);
            String name = scan.next();
            list.add(name);
        }
        System.out.println("The list is as follows: ");
        printArray(list);*/

        // Question 2
        // use the date class to print the date in the following format - 21: 47: 02

        /*Date date = new Date();
        System.out.println(date.getHours()+" : "+date.getMinutes()+" : "+date.getSeconds());*/

        // Question 3
        // repeat 2 using Calendar Class

        /*Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY) + " : " + calendar.get(Calendar.MINUTE) + " : " + calendar.get(Calendar.SECOND) +calendar.get(Calendar.AM_PM));
        System.out.println();*/
        // System.out.println(calendar.get(Calendar.HOUR) + " : " + calendar.get(Calendar.) + " : " + calendar.get(Calendar.HOUR));

        // question 4
        // repeat 2 using java.time API

        /*LocalTime time = LocalTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s a");
        String fTime = df.format(time);
        System.out.println(fTime);*/

        // question 5
        // Create a set
        // try to store duplicate elements inside this set
        // verify that only one instance is stored

//        Set<Integer> set = Set.of(54, 21, 34, 89, 32, 26, 23);
//        System.out.println(set);
        // we cannot instantiate a set so we have to use Hashset here
        HashSet<String> set = new HashSet<>();
        set.add("Hariom");
        set.add("Piyush");
        set.add("Mohit");
        set.add("Somesh");
        set.add("Aman");
        set.add("Aman");
        // despite of adding aman 2 times we only have one refrence of Aman in the set

        System.out.println(set);
    }
}
