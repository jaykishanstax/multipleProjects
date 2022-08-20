package com.practice.work.codewars.fighter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Two_Fighter_One_Winner_Test {

    @Test
    public void basicTests() {
        assertEquals("Lew", Two_Fighter_One_Winner.declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Lew"));
       assertEquals("Harry", Two_Fighter_One_Winner.declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", Two_Fighter_One_Winner.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", Two_Fighter_One_Winner.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"));
        assertEquals("Harald", Two_Fighter_One_Winner.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"));
        assertEquals("Harald", Two_Fighter_One_Winner.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald"));
    }


}
