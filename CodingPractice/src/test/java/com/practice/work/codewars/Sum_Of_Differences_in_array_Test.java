package com.practice.work.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Sum_Of_Differences_in_array_Test
{
    @Test
    public void basicTests() {
        assertEquals(9, Sum_Of_Differences_in_array.sumOfDifferences(new int[]{1, 2, 10}));

        assertEquals(12, Sum_Of_Differences_in_array.sumOfDifferences(new int[]{7, 16, 8, 4, 11, 14}));

        assertEquals(9, Sum_Of_Differences_in_array.sumOfDifferences(new int[]{1, 2, 10}));
        assertEquals(2, Sum_Of_Differences_in_array.sumOfDifferences(new int[]{-3, -2, -1}));
        assertEquals(0, Sum_Of_Differences_in_array.sumOfDifferences(new int[]{1, 1, 1, 1, 1}));
        assertEquals(34, Sum_Of_Differences_in_array.sumOfDifferences(new int[]{-17, 17}));
        assertEquals(0, Sum_Of_Differences_in_array.sumOfDifferences(new int[0]));
        assertEquals(0, Sum_Of_Differences_in_array.sumOfDifferences(new int[]{0}));
        assertEquals(0, Sum_Of_Differences_in_array.sumOfDifferences(new int[]{-1}));
        assertEquals(0, Sum_Of_Differences_in_array.sumOfDifferences(new int[]{1}));
    }
}
