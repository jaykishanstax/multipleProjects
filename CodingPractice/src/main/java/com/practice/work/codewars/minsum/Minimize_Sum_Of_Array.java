package com.practice.work.codewars.minsum;

import java.util.Arrays;

public class Minimize_Sum_Of_Array {
    public static int minSum(int[] passed)
    {
        Arrays.sort(passed);
        int sum = 0;
        int length = passed.length-1;
        for(int i = 0 ;  i<passed.length/2; i++)
        {
            sum = sum + (passed[i]*passed[length-i]);
        }
        return sum;
    }
}
