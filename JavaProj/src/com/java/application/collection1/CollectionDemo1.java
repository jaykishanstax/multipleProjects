package com.java.application.collection1;

import javax.jws.soap.SOAPBinding;
import java.util.HashMap;

public class CollectionDemo1 {

    public static void main(String[] args)
    {


        User user1 = new User(1,"name", "surname");
        User user2 = new User(1,"name", "surname");
        User user3 = new User(1,"name", "surname");

        HashMap<User, String> map = new HashMap<>();

        map.put(user1, "Employee");
        map.put(user2, "Student");
        map.put(user3, "Data");




    }
}
