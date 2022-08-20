package com.java.application.java8.lambda;

public class MethodRefExample {

    public static void main(String[] args) {
        PrintLen(s -> s.length());
    }

    public static void PrintLen(data dat){
        System.out.println(dat.getlen("hello jkkkk"));
    }

    interface data{
        int getlen(String s);
    }
}
