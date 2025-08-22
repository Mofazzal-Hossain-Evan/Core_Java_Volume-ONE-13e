/* প্যাকেজ ঘোষণা যাতে ডিরেক্টরি স্ট্রাকচারের সাথে সামঞ্জস্য থাকে */
package Game_Character_System;

/* থিওরি: *Core Java* (Volume I, 13th Edition, Chapter 6)-এ বলা হয়েছে যে
   সংঘর্ষ (ambiguity) সমাধান করা যায় override এর মাধ্যমে অথবা superclass-এর অগ্রাধিকার দিয়ে।
   তবে Object ক্লাসের মেথড (যেমন equals())-এর ক্ষেত্রে
   কোনো ইন্টারফেসের default method কার্যকর হয় না, কারণ Object-এর সংস্করণ সবসময় প্রাধান্য পায়।
   যদি প্রোগ্রামার চান, তবে স্পষ্টভাবে override করে এবং
   ইন্টারফেসের default method-কে super দিয়ে ডাকতে পারেন (Horstmann, p. 262)।

   অন্যদিকে, *Effective Java* (Item 20) সতর্ক করে দিয়েছে যে
   Object-এর মেথডগুলোর (equals, hashCode ইত্যাদি) ক্ষেত্রে
   default method ব্যবহার করতে গেলে সাবধান হতে হবে।
   নাহলে বাগ (bug) তৈরি হতে পারে যা বোঝা কঠিন হয়ে যায় (Bloch, p. 109)।
*/

/* GameCharacterSystem ক্লাস, যেখানে main মেথড রাখা হয়েছে
   বিভিন্ন চরিত্র ক্লাস (HybridCharacterWithConflict, HybridCharacterWithSuperclass) টেস্ট করার জন্য */
public class GameCharacterSystem {
    public static void main(String[] args) {

        /* HybridCharacterWithConflict টেস্ট: override দিয়ে সংঘর্ষ সমাধান */
        HybridCharacterWithConflict hybridConflict = new HybridCharacterWithConflict();
        System.out.println("HybridCharacterWithConflict getAbilityName(): " + hybridConflict.getAbilityName());
        System.out.println("Fighter চরিত্রের মজা পরীক্ষা সম্পন্ন!");
        System.out.println();

        /* HybridCharacterWithSuperclass টেস্ট: superclass wins, override ছাড়াই কাজ করছে */
        HybridCharacterWithSuperclass hybridSuper = new HybridCharacterWithSuperclass();
        System.out.println("HybridCharacterWithSuperclass getAbilityName(): " + hybridSuper.getAbilityName());
        System.out.println("Superclass এর মেথড ডিফল্ট মেথডকে ছাপিয়ে গেল!");
        System.out.println();

        /* equals() মেথড টেস্ট: Object-এর সংস্করণই কার্যকর হয়, ইন্টারফেসের default নয় */
        HybridCharacterWithConflict obj1 = new HybridCharacterWithConflict();
        HybridCharacterWithConflict obj2 = new HybridCharacterWithConflict();
        System.out.println("obj1 এবং obj2 কি সমান? " + obj1.equals(obj2));
        // false, কারণ Object-এর equals() identity-based কাজ করে
        System.out.println("ইন্টারফেসে default equals() থাকলেও Object-এর সংস্করণই কার্যকর হয়।");
        System.out.println("যদি Fighter-এর default equals() ব্যবহার করতে চাই, তবে override করতে হবে:");
        // @Override
        // public boolean equals(Object o) {
        //     return Fighter.super.equals(o);
        // }
        System.out.println();

        /* অতিরিক্ত নোট: যদি দুইটি ইন্টারফেসেই default equals() থাকে, তবুও Object-এর সংস্করণই প্রাধান্য পাবে */
    }
}
