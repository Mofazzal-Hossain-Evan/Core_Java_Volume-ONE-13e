/* Package declaration to match directory structure */
package Game_Character_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) bases its wisdom on the "class wins" rule: superclass methods trump interface defaults like a boss in a video game (Horstmann, p. 261). Humor break: Superclasses are the straight man in the comedy duo—always getting the last laugh over flashy defaults! */

/* Superclass BaseCharacter with concrete getAbilityName */
public class BaseCharacter {
    public String getAbilityName() {
        return "Base Ability: Do Nothing... but do it hilariously!";
    }
}

/* থিওরি: *Core Java* (Volume I, 13th Edition, Chapter 6)-এ ব্যাখ্যা করা হয়েছে
   "class wins" নিয়মটি অনুসারে superclass-এর মেথড সবসময় interface-এর
   default method-এর উপরে প্রাধান্য পায়।
   অর্থাৎ, যদি কোনো ক্লাস তার superclass থেকে একটি মেথড ইনহেরিট করে এবং
   একই মেথড একটি ইন্টারফেসে default হিসেবে থাকে,
   তবে superclass-এর মেথডই কার্যকর হবে (Horstmann, p. 261)।
*/
