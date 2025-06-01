package GameCharacterAutoLevelUpSystem;

import java.util.HashMap;
import java.util.Map;

public class GameCharacter {

    private static Map<Integer, Integer> levelXp = new HashMap<>();
    private  String name;
    private int level;
    private int xp;

    static {
        levelXp.put(1,100);
        levelXp.put(2,300);
        levelXp.put(3,599);
    }

    {
        level = 1;
    xp = 0;

    /***
     * এই অংশটায় **GameCharacter** ক্লাসের **object initialization block** ব্যবহার করে
     * প্রতিটি চরিত্রকে **লেভেল ১** থেকে শুরু করানো হচ্ছে এবং **XP (Experience Points) 0** সেট করা হচ্ছে।
     *
     * 📌 **কীভাবে কাজ করে?**
     * - যখন নতুন **GameCharacter** অবজেক্ট তৈরি হবে,
     * তখন **instance variables** (`level` ও `xp`) প্রথমে **default value (0, null)** পাবে।
     * - এরপর **object initialization block** চলবে, যা **level = 1** এবং **xp = 0** সেট করবে।
     * - তারপর **constructor** চলবে, যেখানে কেবল **name** সেট করা হয়।
     *
     * 🎮 **এই পদ্ধতি কেন দরকার?**
     * - প্রতিটি **GameCharacter** একইভাবে **level 1** থেকে শুরু করবে, কন্সট্রাক্টরে না লিখেও এটা নিশ্চিত করা যায়।
     * - কোড **সংক্ষিপ্ত ও সহজবোধ্য** হয়।
     * - ইনিশিয়ালাইজেশন ভুল হওয়ার সম্ভাবনা কমে যায়।
     *
     * 🔍 **তুমি চাইলেই এটা পরিবর্তন করে প্রতিটি চরিত্রকে ডিফল্টভাবে লেভেল 5 থেকে শুরু করাতে পারো!** 😃
        ***/
    }

    public GameCharacter(String name) {
        this.name = name;
    }

    public void gainXP(int points){
        xp += points;
        if(xp >= levelXp.get(level)){
            level++;
            System.out.println(name + " leveled up to " + level + "!");
        }
    }
}
