/* প্যাকেজ ঘোষণা যাতে ডিরেক্টরি স্ট্রাকচারের সাথে সামঞ্জস্য থাকে */
package Game_Character_System;

/* থিওরি: *Core Java* (Volume I, 13th Edition, Chapter 6)-এ ব্যাখ্যা করা হয়েছে যে
   "class wins" নিয়ম অনুসারে superclass থেকে প্রাপ্ত মেথড সবসময়
   ইন্টারফেসের default method-এর উপরে প্রাধান্য পায়।
   এর ফলে সংঘর্ষ (conflict) এড়ানো যায় এবং প্রোগ্রামে কোনো অস্পষ্টতা থাকে না।
   অর্থাৎ, যদি superclass ও ইন্টারফেস উভয়েই একই নামের মেথড প্রদান করে,
   তবে superclass-এর বাস্তবায়ন (implementation) কার্যকর হয় (Horstmann, p. 261)।
*/

/* HybridCharacterWithSuperclass ক্লাসটি BaseCharacter ক্লাসকে extend করেছে
   এবং পাশাপাশি Fighter ও Healer ইন্টারফেস implement করেছে।
   তবে এখানে কোনো override প্রয়োজন হয়নি,
   কারণ superclass (BaseCharacter)-এর মেথড স্বয়ংক্রিয়ভাবে
   ইন্টারফেসের default method-এর উপরে প্রাধান্য পেয়েছে। */
public class HybridCharacterWithSuperclass extends BaseCharacter implements Fighter, Healer {
    // এখানে কোনো override প্রয়োজন নেই; BaseCharacter-এর মেথডই কার্যকর হবে
}
