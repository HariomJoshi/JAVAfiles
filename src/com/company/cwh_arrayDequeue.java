package com.company;

import java.util.ArrayDeque;

public class cwh_arrayDequeue {
    public void printArrayDeque(ArrayDeque<Integer> list){
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.getFirst());
            System.out.println(list.getLast());
            // System.out.println(list.getClass());
        }
    }
    public static void main(String[] args) {
        // list 1
        ArrayDeque<Integer> list = new ArrayDeque<>();
        list.add(7);
        list.add(43);
        list.add(4);
        list.add(8);
        list.add(18);

        //list 2
        ArrayDeque<Integer> list1 = new ArrayDeque<>();
        list1.add(2);
        list1.add(43);
        list1.add(76);
        list1.add(34);
        list1.add(27);

        //making an object
        cwh_arrayDequeue obj = new cwh_arrayDequeue();
        //obj.printArrayDeque(list);
        //obj.printArrayDeque(list1);
        list.addAll(list1);
        //obj.printArrayDeque(list);
        System.out.println(list);
    }
}
