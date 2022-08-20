package com.practice.work.codewars.divisible;

import java.util.Arrays;
import java.util.stream.LongStream;

public class Count_the_divisible_numbers {
    // Complete the function that takes 3 numbers x, y and k (where x ≤ y),
    // and returns the number of integers within the range [x..y] (both ends included) that are divisible by k.
    //
    //More scientifically: { i : x ≤ i ≤ y, i mod k = 0 }


    public static long divisibleCount(long x, long y, long k) {

        /*return   Math.floorDiv(y, k) - Math.floorDiv(x - 1, k);
*/
        // Solution-2
        /*if(x%k ==0) return (y/k - x/k + 1);
        else return (y/k - x/k);
        }*/

        // Solution-3
        // return x % k == 0 ? (y / k) - (x / k) + 1 : (y / k) - (x / k);

        //Solution-4
        return y / k - x / k + (x % k > 0 ? 0 : 1);

    }
}
