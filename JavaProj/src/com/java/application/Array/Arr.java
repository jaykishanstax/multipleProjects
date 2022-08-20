package com.java.application.Array;

import java.util.Arrays;
import java.util.List;

public class Arr {
    public static void main(String[] args) {
        String[][] src = {{"A"},{"B", "C"},{"D", "E", "F"}};

        int weights[] = {1,3,2,6,4,2,4};

        int value = Arrays.stream(weights).sum();
        System.out.println(value);




        List<String[]> list = Arrays.asList(src);
        System.out.println(list.toString());

        String[][] srcCloned  = src.clone();


        System.out.println(srcCloned.toString());
        String[][] dest = Arrays.copyOf(src, 3);
        src[2][2]= "X";
        System.out.print(src[2].equals(dest[2]));
    }
}