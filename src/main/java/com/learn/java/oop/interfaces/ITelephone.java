package com.learn.java.oop.interfaces;

public interface ITelephone {
    //All fields inside an interface are implicitly
    //public static final

    String test = null;

    void powerOn();

    void dial(int phoneNumber);

    void answer();

    boolean callPhone(int phoneNumber);

    boolean isRinging();


}
