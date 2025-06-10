package core;

import java.lang.reflect.Method;

public class Character {
    private String name;
    private int health;
    private int level;

    public Character(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    // ব্যাখ্যা: useAbility মেথড রিফ্লেকশন ব্যবহার করে ডায়নামিকভাবে ক্ষমতা (ability) কল করে।
    public void useAbility(String abilityName, Object...args) throws ReflectiveOperationException{
        Method method = this.getClass().getMethod(abilityName, getParameterTypes(args));
        method.invoke(this, args);
    }
    // ব্যাখ্যা: displayStats মেথড চরিত্রের তথ্য প্রদর্শন করে।
    public void displayStats(){
        System.out.println(name + " (Health: " + health + ", Level: " + level + ")");
    }
// ব্যাখ্যা: getParameterTypes আর্গুমেন্টের টাইপ নির্ধারণ করে।
    private Class<?>[] getParameterTypes(Object...args){
        Class<?>[] types = new Class<?>[args.length];
        for (int i =0; i <args.length; i++){
            types[i] = args[i].getClass();
        }
        return types;
    }
    // Getter ও Setter


    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
}
