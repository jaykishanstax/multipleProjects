package com.java.application.LC;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {

        System.out.println("Max Area : " +maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
//        System.out.println("Max Area : " +maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
  //      System.out.println("Max Area : " +maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    public static int maxArea(int[] height){
        int maxArea = 0;
        int a_pointer = 0;
        int b_pointer = height.length -1;

        while (a_pointer < b_pointer){
            if (height[a_pointer] < height[b_pointer]){
                maxArea = Math.max(maxArea, height[a_pointer] * (b_pointer - a_pointer));
                a_pointer += 1;
            } else {
                maxArea = Math.max(maxArea, height[b_pointer] * (b_pointer - a_pointer));
                b_pointer -= 1;
            }
        }

        return maxArea;

    }
}
