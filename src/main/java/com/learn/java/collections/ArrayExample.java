package com.learn.java.collections;

public class ArrayExample {

    public static void main(String[] args) {
        int[] myIntArray = new int[25]; //initialise array

        System.out.println("initials values :");
        printArray(myIntArray);

        for (int i = 0; i < 25; i++) {
            myIntArray[i] = i * 10;
        }

        printArray(myIntArray);
        System.out.println(myIntArray[25]); //out of bounds exception
    }

    private static void printArray(int[] myIntArray) {
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println(myIntArray[i]);
        }
    }
}
