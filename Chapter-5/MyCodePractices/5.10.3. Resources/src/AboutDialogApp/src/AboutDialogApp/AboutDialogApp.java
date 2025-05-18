package AboutDialogApp;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class AboutDialogApp {

    public static void main(String[] args) throws IOException {
        SwingUtilities.invokeLater(AboutDialogApp::showAboutDialog);
    }

        public static void showAboutDialog(){
            JPanel panel = new JPanel(new BorderLayout(10,12));
            panel.setBackground(Color.white);

            panel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));

            ImageIcon icon = null;
            try{
                java.net.URL imageURL = AboutDialogApp.class.getResource("/images/logo.png");
                if (imageURL != null){
                    icon = new ImageIcon(imageURL);
                }
            } catch (Exception e){
                e.printStackTrace();
            }

            if (icon != null){
                JLabel imageLabel = new JLabel(icon);
                panel.add(imageLabel, BorderLayout.WEST);
            }

            // ⬇️ টেক্সট ফাইল লোড করো
        StringBuilder aboutText = new StringBuilder();
            try(InputStream is = AboutDialogApp.class.getResource("/data/about.txt").openStream();
                Scanner scanner = new Scanner(is)) {
                while (scanner.hasNextLine()){
                    aboutText.append(scanner.nextLine()).append("\n");
                }
            } catch (Exception e){
                aboutText.append("Could not load about information.");
                e.printStackTrace();
            }

            JTextArea textArea = new JTextArea(aboutText.toString());
            textArea.setEditable(false);
            textArea.setFont(new Font("Serif", Font.PLAIN, 14));
            panel.add(textArea,BorderLayout.CENTER);

            // ⬇️ ডায়ালগ দেখাও
            JOptionPane.showMessageDialog(
                    null,
                    panel,
                    "About",
                    JOptionPane.INFORMATION_MESSAGE);
            
        }
    }


