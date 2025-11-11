package Greeter;

import javax.swing.*;
import java.awt.event.*;
import java.time.Instant;

class Greeter {
    public void greet(ActionEvent event) {
        System.out.println("Hello, the time is " + Instant.ofEpochMilli(event.getWhen()));
    }
}

class RepeatedGreeter extends Greeter {
    public void greet(ActionEvent event) {
        Timer timer = new Timer(1000, super::greet);
        timer.start();
    }
}

public class GreeterDemo {
    public static void main(String[] args) {
        new RepeatedGreeter().greet(null);
        JOptionPane.showMessageDialog(null, "Running super::greet every second...");
        System.exit(0);
    }
}
