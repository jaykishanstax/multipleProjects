package com.java.application.gc;

import java.util.ArrayList;
import java.util.HashMap;
// When o1 is eligible for Garbage collection
public class GCDemo {
    public static ArrayList<Object> l = new ArrayList<>();
    public void gcCheckForo1() {
        HashMap<String, Object> m = new HashMap<>();
        Object o1 = new Object(); // line n1
        Object o2 = new Object();
        m.put("o1", o1);
        o1 = o2; // line n2
        o1 = null; // line n3
        l.add(m);
        m = null; // line n4
        System.gc();// line n5
    }
}