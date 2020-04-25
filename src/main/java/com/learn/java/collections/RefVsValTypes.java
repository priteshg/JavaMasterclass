package com.learn.java.collections;

import java.util.Arrays;

public class RefVsValTypes {


    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherIntArray = myIntArray;

        System.out.println("myIntValue = " + Arrays.toString(myIntArray));
        System.out.println("anotherIntValue = " + Arrays.toString(anotherIntArray));

        anotherIntArray[0] = 1;

        System.out.println("myIntValue = " + Arrays.toString(myIntArray));
        System.out.println("anotherIntValue = " + Arrays.toString(anotherIntArray));

        anotherIntArray = new int[]{4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("after modify myIntValue = " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherIntValue = " + Arrays.toString(anotherIntArray));

    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        //de-referencing array
        array = new int[]{1, 2, 3, 4, 5};
    }
}
