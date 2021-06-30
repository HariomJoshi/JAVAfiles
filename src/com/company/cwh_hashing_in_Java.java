package com.company;

import java.util.HashSet;
// import java.util.Hash

public class cwh_hashing_in_Java {
    public static void main(String[] args) {
        HashSet<Integer> list = new HashSet<>(20);
        for(int i = 0; i< 170; i++){
            list.add(i);
        }
        System.out.println(list);
    }
}
