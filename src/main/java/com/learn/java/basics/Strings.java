package com.learn.java.basics;

public class Strings {

    public static void main(String[] args) {
        //byte - 1 byte
        //short -
        //int
        //float
        //double
        //char - 2 bytes
        //boolean

        //String is a sequence a chars contain 2.14 Billion (max value of int)
        String myString = "This is a string";

        System.out.println("MyString is equal to: "+myString);
        myString = myString + ", this is more";
        System.out.println("MyString is equal to: "+myString);
        myString = myString + " \u00A9 2019";
        System.out.println("MyString is equal to: "+myString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt; //this converts it to a string
        System.out.println("lastString is equal to: "+lastString);


        lastString = "10";
        double myDouble = 50.47d;
        lastString = lastString + myDouble; //this converts it to a string
        System.out.println("lastString is equal to: "+lastString);


        //String are immutable
        //When we append to a string like above ^^ an actual new string is created


        //If we want to append values more efficient to use a stringBuffer
    }


}
