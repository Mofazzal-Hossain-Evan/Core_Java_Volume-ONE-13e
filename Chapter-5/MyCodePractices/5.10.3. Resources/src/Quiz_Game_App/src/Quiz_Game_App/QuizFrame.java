//// File: QuizFrame.java
//package Quiz_Game_App;
//
//import javax.swing.*;
//import java.awt.*;
//import java.net.URL;
//import java.util.List;
//
//public class QuizFrame extends JFrame {
//    private final List<Questions> questions;
//    private int index = 0;
//    private int score = 0;
//
//    private final JLabel questionLabel = new JLabel("", SwingConstants.CENTER);
//    private final JLabel imageLabel = new JLabel("", SwingConstants.CENTER);
//    private final JRadioButton[] options = new JRadioButton[4];
//    private final ButtonGroup group = new ButtonGroup();
//    private final JButton submitButton = new JButton("Submit");
//
//    public QuizFrame(List<Questions> questions) {
//        this.questions = questions;
//        setupUI();
//        displayQuestion();
//    }
//
//    private void setupUI() {
//        setTitle("Quiz Game");
//        setSize(400, 500);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLayout(new BorderLayout());
//
//        add(questionLabel, BorderLayout.NORTH);
//        add(imageLabel, BorderLayout.CENTER);
//
//        JPanel optionPanel = new JPanel(new GridLayout(4, 1));
//        for (int i = 0; i < 4; i++) {
//            options[i] = new JRadioButton();
//            group.add(options[i]);
//            optionPanel.add(options[i]);
//        }
//        add(optionPanel, BorderLayout.SOUTH);
//
//        submitButton.addActionListener(e -> checkAnswer());
//        add(submitButton, BorderLayout.PAGE_END);
//
//        setLocationRelativeTo(null);
//        setVisible(true);
//    }
//
//    private void displayQuestion() {
//        if (index >= questions.size()) return;
//
//        Questions q = questions.get(index);
//        questionLabel.setText("<html><center>" + q.questionText + "</center></html>");
//
//        URL imgUrl = getClass().getResource("/mona.jpg/" + q.imageName);
//        if (imgUrl != null) {
//            imageLabel.setIcon(new ImageIcon(imgUrl));
//            imageLabel.setText("");
//        } else {
//            imageLabel.setIcon(null);
//            imageLabel.setText("Image not found");
//        }
//
//        for (int i = 0; i < 4; i++) {
//            options[i].setText(q.answers[i]);
//            options[i].setSelected(false);
//        }
//        group.clearSelection();
//    }
//
//    private void checkAnswer() {
//        int selected = -1;
//        for (int i = 0; i < 4; i++) {
//            if (options[i].isSelected()) {
//                selected = i;
//                break;
//            }
//        }
//
//        if (selected == -1) {
//            JOptionPane.showMessageDialog(this, "একটি উত্তর নির্বাচন করুন!", "Warning", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
//
//        if (selected == questions.get(index).correctAnswer) {
//            score++;
//        }
//
//        index++;
//        if (index < questions.size()) {
//            displayQuestion();
//        } else {
//            JOptionPane.showMessageDialog(this,
//                    "Quiz শেষ! আপনি পেয়েছেন: " + score + "/" + questions.size(),
//                    "Result", JOptionPane.INFORMATION_MESSAGE);
//            submitButton.setEnabled(false);
//        }
//    }
//}
