package com.java.application.AZ;

import java.util.List;
import java.util.ArrayList;


public class TruckProblem {

    /*
    Sample input :
    3
    1 5
    10 3
    3 4

    Sample output :
    1
     */

    public static void main(String[] args) {
        List<List<Integer>> petrolpumps = new ArrayList<>();

        List<Integer> petroPump1 = new ArrayList<>();
        petroPump1.add(1);
        petroPump1.add(5);
        petrolpumps.add(petroPump1);

        List<Integer> petroPump2 = new ArrayList<>();
        petroPump2.add(10);
        petroPump2.add(3);
        petrolpumps.add(petroPump2);

        List<Integer> petroPump3 = new ArrayList<>();
        petroPump3.add(3);
        petroPump3.add(4);
        petrolpumps.add(petroPump3);

        System.out.println(truckTour(petrolpumps));
    }


    public static int truckTour(List<List<Integer>> petrolpumps) {
        // Write your code here
        int petrolpumpsSize = petrolpumps.size();
        int sum = 0;
        int result = 0;
        int total = 0;
        for (int i = 0; i < petrolpumpsSize; i++) {

            sum += petrolpumps.get(i).get(0) - petrolpumps.get(i).get(1);
                if (sum < 0) {
                total += sum;
                sum = 0;
                result = i + 1;
            }
        }
        total += sum;
        return total < 0 ? -1 : result;
    }

}




