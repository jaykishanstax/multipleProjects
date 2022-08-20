package com.practice.work.codewars;


import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Sum_Of_Differences_in_array {

    public static int sumOfDifferences(int[] arr) {

        // Solution-1
       /* if(arr.length == 0){
            return 0;
        }
        // Sorting in descending order
        arr = IntStream.of(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();
        return sumPairs(arr,arr.length);*/

        // Solution-2
        /*Arrays.sort(arr);
        return arr.length <= 1 ? 0 : arr[arr.length-1] - arr[0];*/

        //Solution-3
        /*
          The idea is that such sum could be flatten. Example:
          [2, 1, 10]
          (10 - 2) + (2 - 1) = 8 + 1 = 9
          10 -2 + 2 -1 = 10 - 1
          So all elements except max and min will be used twice (one time with + and one tme ith -) so they will be erased.
        */
        /*if (arr.length < 2) {
            return 0;
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return max - min;*/

        //Solution-4
        IntSummaryStatistics stat = Arrays.stream(arr).summaryStatistics();
        return arr.length > 1 ? stat.getMax() - stat.getMin() : 0;

    }

    static int sumPairs(int arr[], int n)
    {
        // final result
        int sum = 0;

        //sum = arr[0] - arr[n-1];
        for(int i = 0;i<n-1;i++){
            sum += (arr[i] - arr[i+1]);
        }
        return sum;
    }
}
