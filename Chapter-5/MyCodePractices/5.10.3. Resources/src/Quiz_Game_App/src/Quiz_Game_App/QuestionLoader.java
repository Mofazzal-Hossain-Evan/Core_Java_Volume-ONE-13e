//// File: QuestionLoader.java
//package Quiz_Game_App;
//
//import java.io.*;
//import java.nio.charset.StandardCharsets;
//import java.util.ArrayList;
//import java.util.List;
//
//public class QuestionLoader {
//    public static List<Question> loadQuestions() {
//        List<Question> list = new ArrayList<>();
//        String path = "/quiz/questions.txt";
//
//        try (InputStream stream = QuestionLoader.class.getResourceAsStream(path)) {
//            if (stream == null) {
//                System.err.println("Resource not found: " + path);
//                return list;
//            }
//
//            BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8));
//            String line;
//            String questionText = null;
//            String[] answers = new String[4];
//            int correct = -1;
//            String image = null;
//            int i = 0;
//
//            while ((line = reader.readLine()) != null) {
//                line = line.trim();
//                if (line.isEmpty()) continue;
//
//                if (questionText == null) {
//                    questionText = line;
//                } else if (i < 4) {
//                    answers[i++] = line;
//                } else if (correct == -1) {
//                    correct = Integer.parseInt(line);
//                } else {
//                    image = line;
//                    list.add(new Question(questionText, answers, correct, image));
//                    questionText = null;
//                    answers = new String[4];
//                    correct = -1;
//                    image = null;
//                    i = 0;
//                }
//            }
//
//        } catch (IOException | NumberFormatException e) {
//            System.err.println("Error loading questions: " + e.getMessage());
//        }
//        return list;
//    }
//}