package com.java.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class hello {

    int id = 1;

    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);



        Stream s = list.stream().filter(x -> x > 3);



        list.removeIf(x -> x>3);
        List<Integer> res = (List<Integer>) s.collect(Collectors.toList());

        System.out.println(res.toString());

        String s11 = "baby";

        int a = s11.charAt(0) - 95;

        System.out.println("test " + a);

       /* s11.replace()

        list.stream().

        String s22 = new String("HELLO");
        System.out.println(s11 == s22);  // false
        System.out.println(s11.equals(s22)); // true

        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 =  new String("HELLO");

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true*/




       /* int count=1;
        for(int i=0;i<c1.length;i++)  ball
        {
            for(int j=0;j<c2.length;j++)  >> labi
            if(c2[j]==c1[i])
            {
                count++;
            }
        }
        if(count==c2.length)
            return true;
        else return false;*/

    }
}
