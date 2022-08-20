package com.practice.work.codewars.pairfind;

import java.util.HashMap;

public class PairOfGloves {

/*    input = ["red", "green", "red", "blue", "blue"]
    result = 2 (1 red pair + 1 blue pair)

    input = ["red", "red", "red", "red", "red", "red"]
    result = 3 (3 red pairs) */

    public static int numberOfPairs(String[] gloves) {

        int result = 0;
        HashMap<String, Integer> glovesMap = new HashMap<>();
        for(String glove:gloves){

            if(glovesMap.containsKey(glove)){
                glovesMap.remove(glove);
                result++;
            }
            else {
                glovesMap.put(glove, 1);
            }
        }
        return result;

        /*var s = new HashSet<String>();
        var r = 0;
        for (var x : a)
            if (s.contains(x)) {
                s.remove(x);
                r++;
            } else s.add(x);
        return r;*/
    }


}
