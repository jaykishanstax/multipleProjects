package com.java.application.java8.lambda;

public class RunnableExample {

    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("test Thread1");
            }
        });

        t.run();

        // above code can be written as below
        Thread myThread = new Thread(() -> System.out.println("Test My Data"));
        myThread.run();
        myThread.setPriority(3);

    }
}
