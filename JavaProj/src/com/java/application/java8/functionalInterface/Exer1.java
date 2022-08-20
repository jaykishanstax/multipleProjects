package com.java.application.java8.functionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Exer1 {
    public static void main(String[] args) {

        List<Persion> persion = Arrays.asList(
                new Persion("jk0", "casdas0", 0),
                new Persion("jk",  "as", 1),
                new Persion("jk2", "as2", 2),
                new Persion("jk3", "cas3", 3),
                new Persion("jk4", "cas4", 4)
        );

        // step-1 sort list by last name
        Collections.sort(persion,  (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // step-2 create method tht at print all element in list
        persion.stream().forEach(p -> System.out.println(p.toString()));


        //  step 3 create method that last name begmning with c
       // persion.stream().filter(p -> p.getLastName().startsWith("ca")).forEach( p -> System.out.println( p.toString()));

    }
}
