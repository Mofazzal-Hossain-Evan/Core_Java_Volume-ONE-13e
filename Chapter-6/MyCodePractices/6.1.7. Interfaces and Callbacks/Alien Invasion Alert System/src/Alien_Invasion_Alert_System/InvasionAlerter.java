package Alien_Invasion_Alert_System;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class InvasionAlerter implements ActionListener {
    private String[] messages = {
            "👽 UFO spotted over Pizza Planet!",
            "🛸 Aliens demand intergalactic tacos!",
            "🚀 Space cows abducted again!",
            "🌌 Alien DJ remixing cosmic beats!",
            "🛰️ Satellite hijacked for alien Netflix!"
    };

    private Random random = new Random();

    @Override
    public void actionPerformed(ActionEvent e) {
        // Pick a random alien message
        String msg = messages[random.nextInt(messages.length)];

        // Print the alert with the event time
        System.out.println(msg + " | Time: " + e.getWhen());

        // Play a radar beep sound
        Toolkit.getDefaultToolkit().beep();
    }
}

