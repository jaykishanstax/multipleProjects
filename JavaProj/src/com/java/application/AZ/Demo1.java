package com.java.application.AZ;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Demo1 {

    public static void main(String[] args) {

    }

    public static List<Integer> minimalHeaviestSetA(List<Integer> arr) {
        // Write your code here

        PriorityQueue<Integer> pq = new PriorityQueue<>( (o1, o2) -> Integer.compare(o2, o1));
        long totalWeight = 0;
        for (Integer integer : arr) {
            totalWeight += integer;
            pq.offer(integer);
        }
        List<Integer> boxAElement = new ArrayList<>();
        long currentWeight = 0;
        for (int i = 0; i < arr.size(); i++) {
            int highWeight = pq.poll();
            currentWeight+= highWeight;
            boxAElement.add(highWeight);
            if(currentWeight> totalWeight-currentWeight){
                break;
            }
        }
        Collections.reverse(boxAElement);
        return boxAElement;

    }
}
