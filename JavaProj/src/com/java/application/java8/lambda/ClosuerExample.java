package com.java.application.java8.lambda;

public class ClosuerExample {

    public static void main(String[] args) {

        int a = 10;
        int b = 40;

        doProcess(a, i -> System.out.println(i+b));


    }

    public static void doProcess(int a, Process p){
        p.process(a);
    }

    interface Process {
        void process(int i);
    }
}
