package com.java.application.LC;

import org.w3c.dom.NodeList;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SumClosest {
    public static void main(String[] args) {
        System.out.println("closest number is :" + threeSumColsest(new int[]{-1, 2 ,1, -4}, 1));
    }

    /*
    find three int. number from array which is closest to the target
     */

    public static int threeSumColsest(int[] nums, int target) {
        // [-1 + 2 -4]
        int result = nums[0] + nums[1] + nums[nums.length-1];
        Arrays.sort(nums);

        // sort array
        // [-4, -1, 1 ,2]
        // loo on each element
        // get first element, next element and last element
        // add 2nd loop, till next element < last element
        // calculate current sum = first element + next element + last element
        // if (sum > target) decress last element   else increase next element
        // if sum-target  < result -target  >>  change result
        // retunr result at last

        for (int i = 0; i < nums.length - 2; i++) {
            int a_pointer = i+1;
            int b_pointer = nums.length-1;

            while (a_pointer < b_pointer){
                int currentSum = nums[i] + nums[a_pointer] + nums[b_pointer];
                if(currentSum > target){
                    b_pointer = b_pointer - 1;
                } else {
                    a_pointer = a_pointer + 1;
                }

                if (Math.abs( currentSum - target) < Math.abs(result-target)){
                    result = currentSum;
                }
            }
        }

        return result;
    }




}


