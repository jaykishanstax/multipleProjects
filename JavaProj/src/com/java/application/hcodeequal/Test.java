package com.java.application.hcodeequal;

import java.util.HashMap;

public class Test {

    public static void main(String[] args){

        User user1 = new User(1,"name", "surname");
        User user2 = new User(1,"name", "surname");
        User user3 = new User(1,"name", "surname");

        HashMap<User, String> map = new HashMap<>();

        map.put(user1, "Employee");
        map.put(user2, "Student");
        map.put(user3, "Data");

        HashMap<String, String> map2 = new HashMap<>();
        /*String data1 = "1";
        String data2 = "1";
        String data3 = "1";*/
        String data1 = new String("1");
        String data2 = new String("1");
        String data3 = new String("1");
        map2.put(data1, "Employee");
        map2.put(data2, "Student");
        map2.put(data3, "Data");
        System.out.println(map2.get(data2));

        System.out.println(map.get(user2));
    }
}
