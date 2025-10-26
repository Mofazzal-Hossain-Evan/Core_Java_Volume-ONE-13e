/* Package declaration to match directory structure */
package Dice_Roller_Game_Simulator;

/* থিয়রি: *Core Java* (Volume I, 13th Edition, Chapter 6) বলে, ক্লাস যেমন DiceRoll ডেটা হোল্ড করে ফাঙ্কশনাল ইন্টারফেসের জন্য, যা ল্যামডা দিয়ে গেম সিমুলেশনে ব্যবহার হয় (Horstmann, p. 274). */

/* DiceRoll class with fields */
public class DiceRoll {
    private int sides;
    private int modifier;

    public DiceRoll(int sides, int modifier) {
        this.sides = sides;
        this.modifier = modifier;
    }

    // Getters
    public int getSides() {
        return sides;
    }

    public int getModifier() {
        return modifier;
    }

    @Override
    public String toString() {
        return "DiceRoll{sides=" + sides + ", modifier=" + modifier + "}";
    }
}