package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String s = "5";

//        while (true) {
//            System.out.println("HELLO");

//            for (int i = 0; i < 1000000; i++) {
//                int j = 1 +1;
//            }
//        }

        String [] names = {"Jimmy", "Sarah", "Zoya", "Andy"};


//        Arrays.sort(names);

        sort(names);

        for (String name : names) {
            System.out.println(name);
        }
    }

    /**
     * compareTo
     *
     * 1 (positive)
     * 0 (equal)
     * -1 (negative)
     *
     */
    public static void sort(String [] numArray) {
        int n = numArray.length;
        String temp = "";

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (numArray[j - 1].compareTo(numArray[j]) > 0) {
                    temp = numArray[j - 1];
                    numArray[j - 1] = numArray[j];
                    numArray[j] = temp;
                }

            }
        }
    }
}
