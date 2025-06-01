package ResourceExplorer;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // GUI চালু করি Swing Thread থেকে
        SwingUtilities.invokeLater(() -> {
            new ResourceExplorer().setVisible(true);
        });

    }
}
