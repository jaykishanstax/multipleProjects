package com.java.application.hcodeequal;

public class User {

    int id ;
    String name;
    String surname;


    public User(int id, String name, String surname) {
        this.id = id;
        this.name=name;
        this.surname=surname;
    }

    /*@Override
    public boolean equals(Object o) {

        // null check
        if (o == null) {
            return false;
        }

        // this instance check
        if (this == o) {
            return true;
        }

        // instanceof Check and actual value check
        if ((o instanceof User)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 1;
    }*/
}
