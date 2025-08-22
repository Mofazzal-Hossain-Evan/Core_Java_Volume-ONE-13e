/* প্যাকেজ ঘোষণা যাতে ডিরেক্টরি স্ট্রাকচারের সাথে সামঞ্জস্য থাকে */
package Game_Character_System;

/* থিওরি: *Effective Java* (Item 21)-এ উল্লেখ আছে যে
   ইন্টারফেস ডিজাইন করার সময় সতর্ক থাকতে হবে,
   কারণ default method সঠিকভাবে পরিকল্পনা না করলে সংঘর্ষ (conflict) হতে পারে।
   একাধিক ইন্টারফেস একই ধরনের default method প্রদান করলে
   কম্পাইলার বিভ্রান্ত হয়ে যায় এবং প্রোগ্রামারকে override করে
   স্পষ্ট সমাধান দিতে হয় (Bloch, p. 112)।
*/

/* ইন্টারফেস Healer যেখানে একটি default getAbilityName মেথড সংজ্ঞায়িত আছে */
public interface Healer {
    default String getAbilityName() {
        return "Heal... because who needs enemies when you have low HP jokes?";
    }
}
