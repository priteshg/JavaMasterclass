package com.learn.java.basics;

public class TernaryOperator {

    public static void main(String[] args) {
        boolean isCar = false;

        //Use this
        if (!isCar) {
            System.out.println("not car");
        }

        //ternary Operator
        boolean wasCar = isCar ? true : false;
        //was car == isCar if is car == true else wasCar = false
    }
}
