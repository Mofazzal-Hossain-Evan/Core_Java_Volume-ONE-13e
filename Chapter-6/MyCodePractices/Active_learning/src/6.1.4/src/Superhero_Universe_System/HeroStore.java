package Superhero_Universe_System;

public class HeroStore {

    private Hero[] heroes;

    public HeroStore() {
        this.heroes = new Hero[]{
                new IronMan("🦾 Iron Man",        8000, 100, "Tech"),
                new IronMan("🤖 War Machine",      6000, 90,  "Tech"),
                new IronMan("💛 Rescue",           5500, 95,  "Tech"),

                new Thor("⚡ Thor",                9500, 150, "God"),
                new Thor("🪓 Thor Jane Foster",    8500, 130, "God"),

                new ProfX("🧠 Professor X",        7000, 80,  "Mutant"),
                new ProfX("🔮 Emma Frost",          6500, 75,  "Mutant"),

                new JeanGrey("🔴 Jean Grey",       9000, 120, "Mutant"),
                new JeanGrey("🔥 Dark Phoenix",    15000,100, "Cosmic")
        };
    }

    public Hero[] getHeroes() {
        return heroes;
    }
}
