package com.learn.java.oop.innerclasses;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("print");

    public static void main(String[] args) {

        //Local
        class ClickListener implements Button.OnClickListener {
            public ClickListener() {
                System.out.println("I have been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }


        /**Anonymous class is a local class with no name declared and initiated at the same time
         //Only required to be used once
         //e.g. Used when attaching event handlers in a button interface for example
         */
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });

        /**
         * The Lambda expression is used to provide the implementation of an interface which has functional interface
         */
        btnPrint.setOnClickListener(title -> System.out.println(title + " was clicked"));
        listen();

//        Gearbox mcLaren = new Gearbox(6);
//        mcLaren.addGear(1, 12.3);
//        Gearbox.Gear second = new Gearbox.Gear(2, 12.3);
//        Gearbox.Gear third = new mcLaren.Gear(2, 12.3);
    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }

        }

    }

}
