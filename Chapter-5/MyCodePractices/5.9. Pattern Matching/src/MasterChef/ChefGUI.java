package MasterChef;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ChefGUI {
    public static void createAndShowGUI(){
        JFrame frame = new JFrame("🍽️ MasterChef Java Edition");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 300);
        frame.setLayout(new BorderLayout());

        JTextArea outputArea = new JTextArea();
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        outputArea.setEditable(false);
        frame.add(new JScrollPane(outputArea), BorderLayout.CENTER);

        JButton generateButton = new JButton("👨‍🍳 Generate Random Chef");
        generateButton.addActionListener((ActionEvent e) -> {
            Chef chef = ChefGenerator.getRandomChef();
            String description = ChefDescriber.describeChef(chef);
            String taste = ChefDescriber.describeTaste(chef);
            outputArea.setText(description + "\n" + taste);
        });

        frame.add(generateButton, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
