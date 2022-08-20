package com.java.application.java8.methodRef;

import com.java.application.java8.functionalInterface.Persion;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {
    public static void main(String[] args) {
        List<Persion> persion = Arrays.asList(
                new Persion("jk0", "casdas0", 0),
                new Persion("jk",  "as", 1),
                new Persion("jk2", "as2", 2),
                new Persion("jk3", "cas3", 3),
                new Persion("jk4", "cas4", 4)
        );

        for (int i = 0; i <persion.size(); i++) {
            System.out.println(persion.get(i).toString());
        }

        String[]  asd = {"asd","aassd"};

        String sada = "asdas";

        sada.indexOf("a");

        System.out.println("-----------------------------------------------");
        for (Persion p:
             persion) {
            System.out.println(p.toString());
        }
        System.out.println("-----------------------------------------------");
        persion.forEach(System.out::println);

    }
}
