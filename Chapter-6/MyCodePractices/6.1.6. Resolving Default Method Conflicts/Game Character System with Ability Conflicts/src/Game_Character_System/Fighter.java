/* Package declaration to match directory structure */
package Game_Character_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) punches in that interfaces can provide default methods, but when they clash, it's like a bar fight— the implementing class has to break it up by overriding (Horstmann, p. 261). Laugh while learning: Defaults are like dad jokes; they work until two dads tell the same one differently! */

/* Interface Fighter with default getAbilityName and equals for fun */
public interface Fighter {
    default String getAbilityName() {
        return "Attack... because why heal when you can deal?";
    }

    default boolean equal(Object o) {
        return false; // Default equals: "Nah, we're not the same—I'm punchier!" But wait, does this even work? Spoiler: Object laughs it off.
    }
}

/* থিওরি: *Core Java* (Volume I, 13th Edition, Chapter 6)-এ উল্লেখ আছে যে
   ইন্টারফেস default method ডিফাইন করতে পারে।
   তবে যখন একাধিক ইন্টারফেস একই নাম ও সিগনেচারের default method প্রদান করে,
   তখন সংঘর্ষ (conflict) ঘটে।
   এই ক্ষেত্রে ইমপ্লিমেন্টিং ক্লাসকে অবশ্যই নিজস্ব override প্রয়োগ করে
   সঠিক বাস্তবায়ন (implementation) নির্ধারণ করতে হয় (Horstmann, p. 261)।
*/

/* ইন্টারফেস Fighter যেখানে default getAbilityName এবং equals
   উদাহরণস্বরূপ প্রদর্শিত হয়েছে */
