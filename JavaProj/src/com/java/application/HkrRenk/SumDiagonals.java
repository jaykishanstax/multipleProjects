package com.java.application.HkrRenk;

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


public class SumDiagonals {

    public static void main(String[] args) {

        List<Integer> i1 = new ArrayList<>();
        i1.add(11);
        i1.add(2);
        i1.add(4);

        List<Integer> i2 = new ArrayList<>();
        i2.add(4);
        i2.add(5);
        i2.add(6);

        List<Integer> i3 = new ArrayList<>();
        i3.add(10);
        i3.add(8);
        i3.add(-12);

        List<List<Integer>> ij = new ArrayList<>();
        ij.add(i1);
        ij.add(i2);
        ij.add(i3);

        System.out.println("Result : " + diagonalDifference(ij));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int d1 = 0, d2 = 0;

        int n = arr.size();

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                // finding sum of primary diagonal
                if (i == j)
                    d1 += arr.get(i).get(j);

                // finding sum of secondary diagonal
                if (i == n - j - 1)
                    d2 += arr.get(i).get(j);
            }
        }

        // Absolute difference of the sums
        // across the diagonals
        return Math.abs(d1 - d2);

    }
}
