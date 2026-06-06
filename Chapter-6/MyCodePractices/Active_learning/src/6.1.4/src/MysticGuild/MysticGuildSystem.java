package MysticGuild;

public class MysticGuildSystem {
    public static void main(String[] args) {

        MysticStore store = new MysticStore();
        Mystic[] mystics = store.getMystics();

        System.out.println("🧙 Welcome to the Arcane Guild! Total Mystics: " + mystics.length + "\n");

        // 1. Static Methods (6.1.4)
        System.out.println("=== 1. 🔧 Static Methods (6.1.4) ===");
        System.out.println(SpellCaster.getSpellTier(9500));
        System.out.println(SpellCaster.getSpellTier(4000));
        System.out.println("Is Archmage? " + SpellCaster.isArchmage(12000));

        SpellCaster summoned = SpellCaster.summonFromScroll("hermione");
        System.out.println("Summoned: " + summoned);

        System.out.println();

        // 2. Private Methods via Default
        System.out.println("=== 2. 🔒 Private Methods (6.1.4) ===");
        Merlin merlin = new Merlin("🧙 Merlin", 9500, 120, "Archmage");
        System.out.println("Can fly high 8000? " + merlin.canFlyHigh(8000));
        System.out.println("Can fly high 12000? " + merlin.canFlyHigh(12000));
        merlin.fly(7000);

        System.out.println();

        // Rest of demonstrations (polymorphism, multiple implements, etc.)
        System.out.println("=== 7. Multiple Implements Example ===");
        Morgana morgana = new Morgana("🌑 Morgana", 8800, 100, "Sorceress");
        morgana.fly(6000);
        morgana.readMind("Enemy");
        morgana.summonElement("Fire", 7500);
        morgana.castSpell("Dark Lord");
        System.out.println("\n🎉 All 6.1.4 + 6.1.3 + 6.1.2 concepts covered through Magic! 🧙✨");




    }
}