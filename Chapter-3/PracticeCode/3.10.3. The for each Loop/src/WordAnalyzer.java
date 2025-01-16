import java.util.Arrays;

public class WordAnalyzer {
public static void main(String[] args) {

    String[] words =  {"apple", "banana", "kiwi", "strawberry"};

    int maxLength = Integer.MIN_VALUE;
    int minLength = Integer.MAX_VALUE;

    String longestWord = "";
    String shortestWord = "";
    int countAbove5 = 0;

    for (String word : words) {
        int length = word.length();
        if(length > maxLength) {
            maxLength = length;
            longestWord = word;
        }
        if (length < minLength) {
            minLength = length;
            shortestWord = word;
        }

        if(length > 5) countAbove5 =+1;
    }

    System.out.println("Words: " + Arrays.toString(words));
    System.out.println("Longest word: " + longestWord);
    System.out.println("Shortest word: " + shortestWord);
    System.out.println("Words longer than 5 characters: " + countAbove5);

}

}
