import java.util.Random;

public class StringScrambler {

    public static void main(String[] args){
        String word ="example";
        char[] chars = word.toCharArray();
        Random random = new Random();

        for (int i = 0; i < chars.length; i++) {
            int j = random.nextInt(chars.length);
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        System.out.println("Scrambled Word: " + new String(chars));
    }
}
