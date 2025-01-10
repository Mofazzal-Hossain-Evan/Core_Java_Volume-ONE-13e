import java.util.Arrays;

public class WordCounter {

    public static void main(String[] args) {

        String sentence = "This is an example sentence for counting words";
        String[] words = sentence.split(" ");

        System.out.println("Word Count: " + words.length);
        System.out.println("Longest Word: " + Arrays.stream(words).max((a, b) -> a.length() - b.length()).orElse(""));
        System.out.println("Shortest Word: " + Arrays.stream(words).min((a, b) -> a.length() - b.length()).orElse(""));
    }
}
