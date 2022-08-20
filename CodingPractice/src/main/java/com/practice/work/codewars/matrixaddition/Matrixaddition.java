package com.practice.work.codewars.matrixaddition;

import java.util.stream.IntStream;

public class Matrixaddition {

    public static int[][] matrixAddition(int[][] a, int[][] b) {

        /*int[][] result = new int[a.length][a.length];

        for(int i =0;i<a.length;i++){
            for(int j=0; j<b.length;j++){

                result[i][j] = a[i][j] + b[i][j];
            }
        }


        return result;*/

        // Solution-2
        IntStream.range(0, a.length * a.length)
                .forEach(n -> a[n / a.length][n % a.length] += b[n / a.length][n % a.length]);
        return a;
    }




}
