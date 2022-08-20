package com.java.application.java8.lambda;

import java.util.function.BiConsumer;

public class ExceptionHandling {

    public static void main(String[] args) {
        int[] arr = {1,3,2,5,4};
        int key = 0;

        processData(arr, key, (v,k) -> {
            try {
                System.out.println(v/k);
            }catch (ArithmeticException e) {
                System.out.println("Arithmetic");
            }

        });
    }

    private static void processData(int[] arr, int key, BiConsumer<Integer, Integer> consumer) {

        for (int i = 0; i <arr.length; i++) {
            consumer.accept(arr[i], key);
        }
    }
}
