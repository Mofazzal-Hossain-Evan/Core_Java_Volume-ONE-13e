package RetroGameQuoteGeneratorApp;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RetroGameQuoteGenerator extends JFrame {
    private static final String[] IMAGE_FILES = {"pizza.gif", "parrot.gif"};
    private static final String QUOTE_FILE = "/data/quotes.txt";
    private static final Random random = new Random();
    private List<String> quotes;
    private JLabel quoteLabel;
    private JLabel imageLabel;

    public RetroGameQuoteGenerator() {
        // Set up the JFrame
        setTitle("Retro Game Quote Generator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        // Load quotes
        quotes = loadQuotes();
        if (quotes.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No quotes found in quotes.txt!", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        } else {
            System.out.println("Loaded quotes: " + quotes);
        }

        // Check if images are available
        if (IMAGE_FILES.length == 0) {
            JOptionPane.showMessageDialog(this, "No images available!", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

        // Validate images
        for (String image : IMAGE_FILES) {
            ImageIcon sprite = new ImageIcon(getClass().getResource("/images/" + image));
            if (sprite.getIconWidth() == -1) {
                JOptionPane.showMessageDialog(this, "Image not found: " + image, "Error", JOptionPane.ERROR_MESSAGE);
                System.exit(1);
            }
        }

        // Image display
        imageLabel = new JLabel("", JLabel.CENTER);
        add(imageLabel, BorderLayout.NORTH);

        // Quote display
        quoteLabel = new JLabel("Click the button to get a quote!", JLabel.CENTER);
        quoteLabel.setFont(new Font(Font.MONOSPACED, Font.BOLD, 16));
        quoteLabel.setForeground(Color.BLACK);
        add(quoteLabel, BorderLayout.CENTER);

        // Button to generate new quote and image
        JButton generateButton = new JButton("Generate Quote");
        generateButton.addActionListener(e -> updateQuoteAndImage());
        add(generateButton, BorderLayout.SOUTH);

        // Initial update
        updateQuoteAndImage();
    }

    private List<String> loadQuotes() {
        List<String> quotes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(getClass().getResourceAsStream(QUOTE_FILE)))) {
            if (getClass().getResourceAsStream(QUOTE_FILE) == null) {
                System.err.println("Quotes file not found: " + QUOTE_FILE);
                return quotes;
            }
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    quotes.add(line);
                }
            }
        } catch (Exception e) {
            System.err.println("Error loading quotes: " + e.getMessage());
            e.printStackTrace();
        }
        return quotes;
    }

    private void updateQuoteAndImage() {
        // Select random quote
        String randomQuote = quotes.get(random.nextInt(quotes.size()));
        quoteLabel.setText("<html><center>" + randomQuote + "</center></html>");
        System.out.println("Displayed quote: " + randomQuote);

        // Select random image
        String randomImage = IMAGE_FILES[random.nextInt(IMAGE_FILES.length)];
        ImageIcon sprite = new ImageIcon(getClass().getResource("/images/" + randomImage));
        if (sprite.getIconWidth() == -1) {
            quoteLabel.setText("Image not found: " + randomImage);
            imageLabel.setIcon(null);
            System.out.println("Failed to load image: " + randomImage);
        } else {
            imageLabel.setIcon(sprite);
            System.out.println("Displayed image: " + randomImage);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RetroGameQuoteGenerator().setVisible(true));
    }
}