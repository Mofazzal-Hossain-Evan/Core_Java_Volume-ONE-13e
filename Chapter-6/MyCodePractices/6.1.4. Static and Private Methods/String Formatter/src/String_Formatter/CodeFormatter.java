package String_Formatter;

/* CodeFormatter uses StringFormatter utilities for code-related formatting */
public class CodeFormatter implements StringFormatter {

    @Override
    public String format(String text) {
        // Example: Use camelCase for code variables
        return StringFormatter.toCamelCase(text);
    }
}
