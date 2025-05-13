import java.awt.*;
import java.io.*;
import java.net.URL;
import java.util.*;
import java.util.List;
import javax.swing.*;

/**
 * A simple Meme Generator that loads random meme images and captions from resources.
 * @version 1.0 2025-05-13
 */
private static final String[] IMAGE_PATHS = {
        "/app/images/meme1.jpg",
        "/app/images/meme2.jpg",
        "/app/images/meme3.jpg"
};

    private static final String CAPTIONS_PATH = "/app/data/captions.txt";
    private static List<String> captions = new ArrayList<>();
    private static Random random = new Random();

    public static void main(String[] args) {
        // Load captions from resource file
        loadCaptions();

        // Create GUI
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void loadCaptions() {
        try (InputStream stream = MemeGenerator.class.getResourceAsStream(CAPTIONS_PATH)) {
            if (stream == null) {
                System.out.println("Stream is null for: " + CAPTIONS_PATH);
                throw new IOException("Caption file not found: " + CAPTIONS_PATH);
            }
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    captions.add(line);
                }
            }
            System.out.println("Captions loaded successfully: " + captions.size() + " items");
        } catch (IOException e) {
            captions.add("Error loading captions: " + e.getMessage());
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("মিম জেনারেটর");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLayout(new BorderLayout());

        // Meme image label
        JLabel imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Caption label
        JLabel captionLabel = new JLabel("মিম জেনারেটরে স্বাগতম!", SwingConstants.CENTER);
        captionLabel.setFont(new Font("Arial", Font.BOLD, 16));

        // Button to generate new meme
        JButton generateButton = new JButton("নতুন মিম");
        generateButton.addActionListener(e -> updateMeme(imageLabel, captionLabel));

        // Add components to frame
        frame.add(imageLabel, BorderLayout.CENTER);
        frame.add(captionLabel, BorderLayout.NORTH);
        frame.add(generateButton, BorderLayout.SOUTH);

        // Load initial meme
        updateMeme(imageLabel, captionLabel);

        // Show frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void updateMeme(JLabel imageLabel, JLabel captionLabel) {
        String imagePath = IMAGE_PATHS[random.nextInt(IMAGE_PATHS.length)];
        URL imageUrl = MemeGenerator.class.getResource(imagePath);
        System.out.println("Trying to load image: " + imagePath);
        if (imageUrl != null) {
            ImageIcon icon = new ImageIcon(imageUrl);
            Image scaledImage = icon.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(scaledImage));
        } else {
            imageLabel.setText("Image not found: " + imagePath);
            System.out.println("Image not found: " + imagePath);
        }
        if (!captions.isEmpty()) {
            captionLabel.setText(captions.get(random.nextInt(captions.size())));
        } else {
            captionLabel.setText("No captions available!");
        }
    }


}