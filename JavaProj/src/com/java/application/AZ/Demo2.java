package com.java.application.AZ;

import java.util.ArrayList;

public class Demo2 {

    public static void main(String[] args) {

        ArrayList<Integer> data = new ArrayList<>();
        data.add(2);
        data.add(3);
        data.add(6);
        data.add(10);
        data.add(11);

        System.out.println("Result : " + getMinimumCost(data, 9));

    }

    public static int getMinimumCost(ArrayList<Integer> parcel, int k){
        int result = 0;
        // k - parcel lenght
        // if space not available available -- 0
        // if space available -- loop on parcel if its sorted
        // on loop if elements are not found upto k-lengh -- then summ it

        int spaceAvailableInTruck  = k - parcel.size();
        if( spaceAvailableInTruck > 0){
            for(int i =1, j = 1;i < k && spaceAvailableInTruck > 0 ; i++){
                if(parcel.get(j-1) != i){
                    result = result + i;
                    spaceAvailableInTruck--;
                }
                else {
                    j++;
                }
            }
        }
        return result;
    }


}
