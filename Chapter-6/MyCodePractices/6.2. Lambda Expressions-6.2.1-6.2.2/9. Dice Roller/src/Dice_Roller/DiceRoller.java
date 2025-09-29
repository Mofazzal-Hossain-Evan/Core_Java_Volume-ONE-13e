package Dice_Roller;

import java.util.function.Supplier;

public class DiceRoller {
    public static void main(String[] args) {
        Supplier<Integer> dice = () -> 1 + (int)(Math.random()*6);
        for (int i= 0; i< 10; i++){
            System.out.println("Dice roll: "+dice.get());
        }
    }
}
