package com.learn.java.multiple_threads.messages;

public class Main {

    public static void main(String[] args) {

    }

    class Message {
        private String message;
        private boolean empty = true;

        public synchronized String read() {
            while (empty) {

            }
            empty = true;
            return message;
        }

        public synchronized void write(String message) {
            while (!empty) {

            }
            empty = false;
            this.message = message;
        }

    }

}

//class Writer implements Runnable{
//    private Message message;
//}
