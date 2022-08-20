package com.java.application.AZ;

public class MinimumMoves {

    public static void main(String[] args) {
        System.out.println("Output : " +minimumMoves(505335291,738766720));
    }

    public static int minimumMoves(int A, int B) {
        // code here
        int moves = 0;
        int totalValue = A * B ;
        int minValue = 0;
        int maxValue = 0;
        if(A < B) {
            minValue = A;
            maxValue = B;
        }else {
            minValue = B;
            maxValue = A;
        }
        moves++;

        int remainingValue = Math.abs(totalValue - (minValue * minValue));

        System.out.println(remainingValue);
        System.out.println(maxValue);
        System.out.println(minValue);

        if(maxValue > minValue){
            int row = maxValue - minValue;
            return moves + minimumMoves(row,minValue);
        }else {
            moves = moves + remainingValue;
        }

        return moves;
    }
}
