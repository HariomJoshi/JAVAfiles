package com.company;

import java.util.*;

/*public class cwh_arrayList_LinkedList {
    public static void printArray(ArrayList<Integer> array){
        for (int i = 0; i< array.size(); i++){
            System.out.println(array.get(i));
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(32);
        list1.add(76);
        list1.add(1, 61);
        list1.add(1, 8);
        // System.out.println(list1);
        printArray(list1);
    }
}*/

// we can also execute the above program with Linked list

public class cwh_arrayList_LinkedList {
    public static void printArrayList(ArrayList<Integer> array){
        for (int i = 0; i< array.size(); i++){
            System.out.println(array.get(i));
        }
    }
    public static void printArray(Object[] array){
        for (int i = 0; i< array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static void printArrayList(LinkedList<Integer> array){
        for (int i = 0; i< array.size(); i++){
            System.out.println(array.get(i));
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(12);
        list2.add(32);
        list2.add(76);
        list2.add(1, 61);
        list2.add(1, 8);
        // System.out.println(list1);
        printArrayList(list2);
        printArray(list2.toArray());

    }
}


