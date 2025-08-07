package String_Formatter;

/* Theory:
   As per Core Java (Vol. I, 13th Ed, Chapter 6), interfaces can hold
   static utility methods and private helpers to provide shared logic
   while keeping implementation details hidden. This is ideal for reusable
   text formatting functions without requiring inheritance.
*/
public interface StringFormatter {

    // Convert string to Title Case (each word capitalized)
    static String toTitleCase(String input) {
        input = cleanInput(input); // Clean first
        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        return result.toString().trim();
    }

    // Convert string to camelCase
    static String toCamelCase(String input) {
        input = cleanInput(input); // Clean first
        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            if (i == 0) {
                result.append(word);
            } else {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1));
            }
        }
        return result.toString();
    }

    // Private helper to remove unwanted characters and trim
    private static String cleanInput(String input) {
        if (input == null) return "";
        return input.replaceAll("[^a-zA-Z0-9\\s]", "").trim();
    }

    // Instance method for polymorphism
    String format(String text);
}
