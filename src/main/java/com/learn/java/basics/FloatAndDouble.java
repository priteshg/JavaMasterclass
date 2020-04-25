package com.learn.java.basics;

public class FloatAndDouble {

    public static void main(String[] args) {

        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;

        System.out.println("Float min value " + myMinFloat);
        System.out.println("Float max value " + myMaxFloat);

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;

        System.out.println("Double min value " + myMinDouble);
        System.out.println("Double max value " + myMaxDouble);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        float myFloatValue2 = (float) 5.25;
        double myDoubleValue = 5.00 / 3.00;

        System.out.println("MyIntValue " + myIntValue);
        System.out.println("MyFloatValue " + myFloatValue);
        System.out.println("myDoubleValue " + myDoubleValue);

        //use double due to compatibility and its actually quicker at the chip level


    }
}
