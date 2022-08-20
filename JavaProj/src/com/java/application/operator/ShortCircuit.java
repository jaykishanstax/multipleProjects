package com.java.application.operator;

public class ShortCircuit {

    public static void main(String[] args) {
        int x, y, z;

        x = 10;
        y = 20;
        z = 30;

        // T T
        // T F
        // F T
        // F F

        //SET A
        boolean a = (x < z) && (x == x);
        boolean b = (x < z) && (x == z);
        boolean c = (x == z) && (x < z);
        boolean d = (x == z) && (x > z);
        //SET B
        boolean aa = (x < z) & (x == x);
        boolean bb = (x < z) & (x == z);
        boolean cc = (x == z) & (x < z);
        boolean dd = (x == z) & (x > z);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("aa = " + aa);
        System.out.println("bb = " + bb);
        System.out.println("cc = " + cc);
        System.out.println("dd = " + dd);


        System.out.println("x = " + x);
        System.out.println("z = " + z);

         x |= z;

        System.out.println("x = " + x);
        System.out.println("z = " + z);
    }
}
