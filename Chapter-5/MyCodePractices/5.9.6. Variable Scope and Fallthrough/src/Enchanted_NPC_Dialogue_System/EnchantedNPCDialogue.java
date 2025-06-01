package Enchanted_NPC_Dialogue_System;

public class EnchantedNPCDialogue {
    public static void main(String[] args) {


        NPC[] npc = {

            new Villager("Liam"),
                    new Wizard(2),
                    new Merchant("Potions"),
                    new Wizard(7),
                    new Villager("Mira"),
                    new Merchant("Weapons")
        };
        System.out.println("🔮 Welcome to the Enchanted NPC Village!\n");

        for (NPC npcs : npc){
            System.out.println("You approach: " + npcs);

            String message = switch (npcs){
                case Wizard w when w.spellCount() >= 5 ->
                        "🧙‍♂️ The wizard stares at you intensely. \"You are not ready for my power.\"";
                case Wizard w ->
                        "✨ The young wizard says, \"Keep practicing. Someday you’ll master magic too.\"";
                case Merchant m when m.getShopType().equals("Weapons") ->
                        "⚔️ The weapon merchant grins. \"Looking for something sharp?\"";
                case Villager v when v.getMood().equals("happy") ->
                        "😊 The villager smiles warmly. \"Lovely day for an adventure, isn't it?\"";
                default ->
                        "🤔 The character seems mysterious and says nothing...";
            };
            System.out.println(message + "\n");
        }
    }
}
