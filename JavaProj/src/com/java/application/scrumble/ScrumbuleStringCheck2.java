package com.java.application.scrumble;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumbuleStringCheck2 {

    // is "jbibay" and target is "baby"
    //  "labi" target is "ball"
    public static void main(String[] args)
    {
        String source = "labi";
        String target = "ball";

        // boolean result = ;
        System.out.println(checkIfPossible(source, target));
    }

    public static boolean checkIfPossible(String source, String target) {
        char[] sourceCharArray = source.toCharArray();
        char[] targetCharArray = source.toCharArray();

        ArrayList<Character> listOfSourceString = new ArrayList<Character>();

       /* List<Character> listOfTargetString = Array.toList(targetCharArray);

        if ((listOfSourceString.size() < listOfTargetString.size()) || (listOfTargetString.size() == 0 && listOfSourceString.size() == 0)) {
            return false
        } else if (listOfSourceString.size() >= listOfTargetString.size()) {
            return listOfSourceString.containsAll()  containsAll(listOfTargetString);
        }
*/

        /*int lenS = source.length();
        int lenT = target.length();
        char[] c = target.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            source = source.replace(c[i]+"","");
        }
        int newLenS = source.length();

        if(newLenS == (lenS-lenT))
        {
            return true;
        } else {
            return false;
        }*/
        //}

        return true;
    }
}
