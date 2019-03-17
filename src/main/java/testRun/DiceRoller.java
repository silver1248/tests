package testRun;

import java.util.Random;

public class DiceRoller {
    
    private static final int NUM_SIDES = 6;
    
    String foo = new String();
    Integer bar = new Integer(1);
    Double doug = new Double(4.5);

    private static int getRandomBetweenOneAnd(int bound) {
        Random dice = new Random();
        return dice.nextInt(6) + 1; 
    }
    
    public static void main(String[] args) {
        int sides = 6;
        System.out.println("Here is a random number between 1 and "+sides+" = " + getRandomBetweenOneAnd(6));
    }

}
