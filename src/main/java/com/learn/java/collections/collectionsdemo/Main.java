package com.learn.java.collections.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
        List<Theatre.Seat> seatsCopy = new ArrayList<>(theatre.seats);
        printList(seatsCopy);

        seatsCopy.get(1).reserve();
        if (theatre.reserveSeat("A02")) {
            System.out.println("please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }

        Collections.reverse(seatsCopy);
        System.out.println("SeatCopy..");
        printList(seatsCopy);

        System.out.println("Original..");
        printList(theatre.seats);
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + "[" + seat.isReserved() + "]");

        }
        System.out.println();
        System.out.println("=================================================================================");
    }

}
