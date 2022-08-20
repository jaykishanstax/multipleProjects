package com.java.application.codewars;


import sun.security.util.ArrayUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sum_Of_Differences_in_array {

    public static int sumOfDifferences(Integer[] arr) {

        // Sorting in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        return sumPairs(arr,arr.length);
    }

    static int sumPairs(Integer arr[], int n)
    {
        // final result
        int sum = 0;
        for (int i = n - 1; i >= 0; i--)
            sum += i * arr[i] - (n - 1 - i) * arr[i];
        return sum;
    }
}
