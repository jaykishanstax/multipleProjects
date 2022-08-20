package com.java.application.scrumble;

public class ScrumberStringCheck1 {

    // is "jbibay" and target is "baby"
    //  "labi" target is "ball"
    public static void main(String[] args)
    {
        String source = "labi";
        String target = "ball";

        boolean result = checkIfPossible(source, target);
        System.out.println(result);
    }

    public static boolean checkIfPossible(String source, String target) {
        boolean possible = true;
        int []charCount = new int[26]; // {1, 1, ....}
        for(int i=0;i<source.length();i++) {
            char c = source.charAt(i);
            charCount[c-'a']++;
        }
        for(int i=0;i<target.length();i++) {
            char c = target.charAt(i);
            if(charCount[c-'a']>0){
                charCount[c-'a']--;
            } else {
                return false;
            }
        }
        return possible;
    }
}
