package com.java.application.inputfromuser;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.regex.Pattern;

public class TakeInputExample {

    //Geek
    //GfG1
    // digit + lowercase char + uppercase char
    // String with 1 numeric, 1 lowercase english, 1 uppercase english apha
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).*$";

    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    public static void main (String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int totalPasswords = Integer.parseInt(sc.nextLine());
        String[] passwords = new String[totalPasswords];
        for(int i =0;i<totalPasswords;i++){
            passwords[i] = sc.nextLine();
        }*/

        String[] passwords = {"Geek","GfG1"};

        for(String password:passwords){
            if(pattern.matcher(password).matches()){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }


    }


}
