package com.data.junit;

import java.util.ArrayList;
import java.util.List;

public class JunitWorkingTest {

    public static void main(String[] args) {
        System.out.println("Hello");

        Integer[] ijk = new Integer[]{1,3,4,5};

        /*Thread myThread = new Thread(()-> System.out.println("test"));
        myThread.start();*/
        System.out.println("Application start ....");

        List<User> userList = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            userList.add(new User());
        }

        System.out.println("Application end....");
    }
}
