package Quiz_Game_App;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * A Swing-based quiz game that loads questions and images from resources.
 * @version 1.1 2025-05-17
 * @author Grok
 */
public class QuizGame {
    private static List<Question> questions;
    private static int currentQuestionIndex;
    private static int score;
    private static JFrame frame;
    private static JLabel questionLabel;
    private static JLabel imageLabel;
    private static JRadioButton[] answerButtons;
    private static ButtonGroup answerGroup;
    private static JButton submitButton;

    public static void main(String[] args) {
        // Load questions from resource file
        questions = loadQuestions();
        if (questions.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No questions loaded! Check console for details.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        currentQuestionIndex = 0;
        score = 0;

        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        // Create the main frame
        frame = new JFrame("Quiz Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setLayout(new BorderLayout());

        // Question label
        questionLabel = new JLabel("", SwingConstants.CENTER);
        frame.add(questionLabel, BorderLayout.NORTH);

        // Image label
        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(imageLabel, BorderLayout.CENTER);

        // Answer options panel
        JPanel answerPanel = new JPanel();
        answerPanel.setLayout(new GridLayout(4, 1));
        answerButtons = new JRadioButton[4];
        answerGroup = new ButtonGroup();
        for (int i = 0; i < 4; i++) {
            answerButtons[i] = new JRadioButton();
            answerGroup.add(answerButtons[i]);
            answerPanel.add(answerButtons[i]);
        }
        frame.add(answerPanel, BorderLayout.SOUTH);

        // Submit button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> handleSubmit());
        frame.add(submitButton, BorderLayout.PAGE_END);

        // Display the first question
        displayQuestion();

        // Center the frame and make it visible
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static List<Question> loadQuestions() {
        List<Question> questionList = new ArrayList<>();
        String resourcePath = "/quiz/question.txt";

        // Debug: Print classpath to understand where resources are being looked up
        System.out.println("Classpath: " + System.getProperty("java.class.path"));

        // Debug: Try to get the resource URL to confirm its location
        URL resourceUrl = QuizGame.class.getResource(resourcePath);
        System.out.println("Resource URL for " + resourcePath + ": " + resourceUrl);

        try (InputStream stream = QuizGame.class.getResourceAsStream(resourcePath)) {
            if (stream == null) {
                System.err.println("Resource not found: " + resourcePath);
                // Fallback: Try loading without leading slash (relative path)
                resourcePath = "quiz/question.txt";
                System.out.println("Trying relative path: " + resourcePath);
                try (InputStream fallbackStream = QuizGame.class.getResourceAsStream(resourcePath)) {
                    if (fallbackStream == null) {
                        System.err.println("Resource still not found: " + resourcePath);
                        return questionList;
                    }
                    return parseQuestions(fallbackStream, questionList);
                }
            }
            return parseQuestions(stream, questionList);
        } catch (IOException e) {
            System.err.println("Error loading questions: " + e.getMessage());
            return questionList;
        }
    }

    private static List<Question> parseQuestions(InputStream stream, List<Question> questionList) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8));
        String line;
        String questionText = null;
        String[] answers = new String[4];
        int correctAnswer = -1;
        String imageName = null;
        int answerIndex = 0;

        while ((line = reader.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) continue;

            if (questionText == null) {
                questionText = line;
            } else if (answerIndex < 4) {
                answers[answerIndex++] = line;
            } else if (correctAnswer == -1) {
                correctAnswer = Integer.parseInt(line);
            } else if (imageName == null) {
                imageName = line;
                // Create and add the question
                questionList.add(new Question(questionText, answers, correctAnswer, imageName));
                // Reset for the next question
                questionText = null;
                answers = new String[4];
                correctAnswer = -1;
                imageName = null;
                answerIndex = 0;
            }
        }
        return questionList;
    }

    private static void displayQuestion() {
        if (currentQuestionIndex >= questions.size()) return;

        Question q = questions.get(currentQuestionIndex);
        questionLabel.setText("<html><center>" + q.questionText + "</center></html>");

        // Load and display the image
        URL imageUrl = QuizGame.class.getResource("/quiz/" + q.imageName);
        if (imageUrl != null) {
            ImageIcon icon = new ImageIcon(imageUrl);
            imageLabel.setIcon(icon);
        } else {
            imageLabel.setIcon(null);
            imageLabel.setText("Image not found: " + q.imageName);
        }

        // Set answer options
        for (int i = 0; i < 4; i++) {
            answerButtons[i].setText(q.answers[i]);
            answerButtons[i].setSelected(false);
        }
        answerGroup.clearSelection();
        submitButton.setEnabled(true);
    }

    private static void handleSubmit() {
        Question q = questions.get(currentQuestionIndex);
        int selectedAnswer = -1;
        for (int i = 0; i < 4; i++) {
            if (answerButtons[i].isSelected()) {
                selectedAnswer = i;
                break;
            }
        }

        if (selectedAnswer == -1) {
            JOptionPane.showMessageDialog(frame, "Please select an answer!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (selectedAnswer == q.correctAnswer) {
            score++;
        }

        currentQuestionIndex++;
        if (currentQuestionIndex < questions.size()) {
            displayQuestion();
        } else {
            submitButton.setEnabled(false);
            JOptionPane.showMessageDialog(frame, "Quiz finished! Your score: " + score + "/" + questions.size(),
                    "Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static class Question {
        String questionText;
        String[] answers;
        int correctAnswer;
        String imageName;

        Question(String questionText, String[] answers, int correctAnswer, String imageName) {
            this.questionText = questionText;
            this.answers = answers.clone();
            this.correctAnswer = correctAnswer;
            this.imageName = imageName;
        }
    }
}