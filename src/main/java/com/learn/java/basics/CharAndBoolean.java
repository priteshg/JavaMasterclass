package com.learn.java.basics;

public class CharAndBoolean {

    public static void main(String[] args) {
        char myChar = 'D';

        // a char has 2 bytes - 16 bits enable it to store all 6000 plus uni-codes chars

        //unicode representation
        char myUnicode = '\u0044';

        System.out.println(myChar);
        System.out.println(myUnicode);

        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;

        System.out.println(myTrueBooleanValue);
        System.out.println(myFalseBooleanValue);


    }
}
