package com.practice.work.codewars.minsum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Minimize_Sum_Of_Array_Test {

    @Test
    public void basicTests()
    {
        assertEquals( 22, Minimize_Sum_Of_Array.minSum(new int[]{5,4,2,3}));
        assertEquals(342, Minimize_Sum_Of_Array.minSum(new int[]{12,6,10,26,3,24}));
        assertEquals( 74, Minimize_Sum_Of_Array.minSum(new int[]{9,2,8,7,5,4,0,6}));
    }
}
