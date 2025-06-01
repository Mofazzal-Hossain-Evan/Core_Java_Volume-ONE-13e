package Pomodoro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PomodoroGUI extends JFrame {
    private JLabel timerLabel = new JLabel("25:00", SwingConstants.CENTER);
    private JButton startButton = new JButton("Start");
    private Timer timer;
    private int minutes = 25;
    private int seconds = 0;
    private int sessionCount = 0;
    private boolean isRunning = false;

    public PomodoroGUI() {
        setTitle("Pomodoro Timer");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        timerLabel.setFont(new Font("Verdana", Font.BOLD, 40));
        add(timerLabel, BorderLayout.CENTER);

        startButton.setFont(new Font("SansSerif", Font.BOLD, 18));
        add(startButton, BorderLayout.SOUTH);

        startButton.addActionListener(new StartButtonListener());

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class StartButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!isRunning) {
                isRunning = true;
                startButton.setText("Running...");
                runTimer();
            }
        }
    }

    private void runTimer() {
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (seconds == 0) {
                    if (minutes == 0) {
                        timer.stop();
                        isRunning = false;
                        sessionCount++;

                        if (sessionCount % 4 == 0) {
                            JOptionPane.showMessageDialog(null, "Long Break! (20 minutes)");
                            minutes = 20;
                        } else {
                            JOptionPane.showMessageDialog(null, "Short Break! (5 minutes)");
                            minutes = 5;
                        }

                        seconds = 0;
                        startButton.setText("Start");
                        timerLabel.setText(String.format("%02d:%02d", minutes, seconds));
                    } else {
                        minutes--;
                        seconds = 59;
                    }
                } else {
                    seconds--;
                }
                timerLabel.setText(String.format("%02d:%02d", minutes, seconds));
            }
        });

        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PomodoroGUI());
    }
}
