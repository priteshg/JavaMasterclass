package com.learn.java.oop.interfaces;

public class InterfacesMain {

    public static void main(String[] args) {
        ITelephone myPhone;
        myPhone = new DeskPhone(12345);
        myPhone.powerOn();
        myPhone.callPhone(123444);
        myPhone.answer();

        myPhone = new MobilePhone(245443);
        myPhone.powerOn();
        myPhone.callPhone(2444444);
        myPhone.answer();

    }

}
