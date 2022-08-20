package com.java.application.AZ;

public class LoopCheck {

    public static void main(String[] args) {
        int j = 1, num1 = 4;
        while (++j <= 10)
        {
            System.out.println(num1);
            num1++;
        }
        /*
        1<= 10 - 4
        2<=10  - 5
        3<=10  - 6
        4<=10  - 7
        5<=10  - 8
        6<=10  - 9
        7<=10  - 10
        8<=10  - 11
        9<=10  - 12
        10<=10 - 13
         */

        System.out.println(num1);
    }
}
