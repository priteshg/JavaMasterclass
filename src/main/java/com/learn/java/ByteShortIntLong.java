package com.learn.java;

public class ByteShortIntLong {

    public static void main(String[] args) {
        int myValue = 1000;
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinValue);
        System.out.println("Integer Max Value = " + myMaxValue);

        System.out.println("Busted MAX value = " + (myMaxValue + 1)); //overflow
        System.out.println("Busted MIN value = " + (myMinValue - 1)); //underflow

        int myMaxIntTest = 2147483647;
        int myMaxIntTestReadable = 2_147_483_647; //use underscores as well
        // write your code here

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Min Byte: " + myMinByteValue);
        System.out.println("Max Byte: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Min short: " + myMinShortValue);
        System.out.println("Max short: " + myMaxShortValue);

        //byte - 8 bits i.e. width of 8
        //short - 16 bits i.e width of 16
        //int - 32 bits i.e. width 0f 32

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Min long: " + myMinLongValue);
        System.out.println("Max long: " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinValue / 2);

        //This won't work - returns an int
        //byte myNewByteValue = (myMinByteValue/2);

        //works! use casting
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);
    }

}
