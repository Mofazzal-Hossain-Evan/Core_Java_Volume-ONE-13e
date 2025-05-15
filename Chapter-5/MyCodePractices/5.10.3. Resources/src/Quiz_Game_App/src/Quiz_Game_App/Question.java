package Quiz_Game_App;

public class QuizGame {
    public final String questionText;
    public final String[] answers;
    public final int correctAnswer;
    public final String imageName;

    public QuizGame(String questionText, String[] answers, int correctAnswer, String imageName) {
        this.questionText = questionText;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
        this.imageName = imageName;
    }


}
