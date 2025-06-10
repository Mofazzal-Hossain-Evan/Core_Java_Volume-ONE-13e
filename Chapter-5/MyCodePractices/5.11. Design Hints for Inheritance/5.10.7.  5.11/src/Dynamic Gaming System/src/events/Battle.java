package events;

import core.Event;

public class Battle extends Event {
    public Battle(String title, java.time.LocalDateTime dateTime, core.Character participant) {
        super(title, dateTime, participant);
    }

    // ব্যাখ্যা: startBattle যুদ্ধ শুরু করে।
    public void startBattle() {
        System.out.println("Battle started for " + getParticipant().getName() + "!");
    }

    // Getter
    public core.Character getParticipant() { return super.participant; }
}