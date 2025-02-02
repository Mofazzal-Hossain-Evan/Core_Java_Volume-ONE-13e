package RealTimeClock;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class RealTimeClock extends JFrame {

    private JLabel timeLabel;

    public RealTimeClock(){
        setTitle("Eli's Clock");

        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLayout(new FlowLayout());

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.BOLD, 30));
        add(timeLabel);

        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                updateClock();
            }
        }, 0, 1000);
        //void scheduleAtFixedRate(TimerTask task, long delay, long period)

        setVisible(true);
    }

    private void updateClock() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        timeLabel.setText(formatter.format(new Date()));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RealTimeClock::new);

    }
}
