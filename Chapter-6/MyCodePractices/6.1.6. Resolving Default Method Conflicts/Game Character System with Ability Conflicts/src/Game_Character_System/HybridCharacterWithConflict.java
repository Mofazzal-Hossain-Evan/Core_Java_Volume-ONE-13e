/* প্যাকেজ ঘোষণা যাতে ডিরেক্টরি স্ট্রাকচারের সাথে সামঞ্জস্য থাকে */
package Game_Character_System;

/* থিওরি: *Core Java* (Volume I, 13th Edition, Chapter 6)-এ ব্যাখ্যা করা হয়েছে যে
   যখন একাধিক ইন্টারফেস একই নামে default method প্রদান করে,
   তখন সংঘর্ষ (conflict) এড়াতে অবশ্যই implementing ক্লাসকে সেই মেথড override করতে হয়।
   প্রয়োজন হলে নির্দিষ্ট কোনো ইন্টারফেসের default method ডাকা যায় super কীওয়ার্ডের মাধ্যমে,
   যা কার্যত ডেভেলপারকে সিদ্ধান্ত নেওয়ার সুযোগ দেয় কোন ইন্টারফেসের বাস্তবায়ন ব্যবহার করা হবে (Horstmann, p. 261)।
*/

/* HybridCharacterWithConflict ক্লাস দুটি ইন্টারফেস (Fighter ও Healer) ইমপ্লিমেন্ট করেছে।
   সংঘর্ষ সমাধানের জন্য getAbilityName() মেথড override করা হয়েছে এবং
   এখানে স্পষ্টভাবে Fighter ইন্টারফেসের default মেথড ব্যবহার করা হয়েছে। */
public class HybridCharacterWithConflict implements Fighter, Healer {
    @Override
    public String getAbilityName() {
        return Fighter.super.getAbilityName() + " (with a healing twist!)";
        // এখানে Fighter ইন্টারফেসের default মেথডকে ডাকা হয়েছে এবং অতিরিক্ত টেক্সট যোগ করা হয়েছে
    }
}
