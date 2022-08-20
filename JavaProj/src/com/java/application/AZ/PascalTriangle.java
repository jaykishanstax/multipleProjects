package com.java.application.AZ;

import java.util.ArrayList;

//Pascal Triangle | Pascal Encryption


public class PascalTriangle {

    public static void main(String[] args) {

        ArrayList<Integer> data = new ArrayList<>();
        data.add(4);
        data.add(5);
        data.add(6);
        data.add(7);

        System.out.println("Result : " + getEncryptedNumber(data));
    }

    public static String getEncryptedNumber(ArrayList<Integer> arr){

        ArrayList<Integer> tempArray = new ArrayList();
        if(arr.size() <=0)
            return arr.get(0).toString();

        while (arr.size() != 2){

            for(int i = 0; i <arr.size()-1; i++){
                int newValue = arr.get(i) + arr.get(i+1);

                if(newValue > 9)
                    newValue = newValue%10;

                tempArray.add(newValue);
            }
            arr = (ArrayList<Integer>) tempArray.clone();
            tempArray.clear();
        }


        return arr.get(0).toString() + arr.get(1).toString() ;
    }
}
