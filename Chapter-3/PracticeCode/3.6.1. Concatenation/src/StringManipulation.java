public class StringManipulation {

    public static void main(String[] args) {

        String size = String.join(" / ", "S", "M", "L", "XL");
        System.out.println("Available sizes: " + size);

        String repeatedWord = "Java".repeat(2);
        System.out.println("Repeated string: " + repeatedWord);

        // Another example with user input
        System.out.println("Creating a pattern...");
        String pattern = "-".repeat(20);
        System.out.println("Pattern: " + pattern);
    }
}
