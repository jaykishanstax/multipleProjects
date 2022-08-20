package com.java.application.java8.methodRef;

public class MethodRefExample {
    public static void main(String[] args) {
        Thread myThread = new Thread(MethodRefExample::printMessage);

        myThread.start();
    }

    private static void printMessage() {
        System.out.println("Hello");
    }
}
