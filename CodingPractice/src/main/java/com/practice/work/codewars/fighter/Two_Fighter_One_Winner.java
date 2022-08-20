package com.practice.work.codewars.fighter;

public class Two_Fighter_One_Winner {

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        // Your code goes here. Have fun!
        Fighter tmpFighter;
        if(fighter1.name != firstAttacker){
            tmpFighter = fighter1;
            fighter1 = fighter2;
            fighter2 = tmpFighter;
        }

        while (fighter1.health > 0 && fighter2.health > 0)
        {
            fighter2.health -= fighter1.damagePerAttack;
            if(fighter2.health <= 0)
                break;
            fighter1.health -= fighter2.damagePerAttack;
        }

        return fighter2.health <= 0 ? fighter1.name:fighter2.name;

    }

}
