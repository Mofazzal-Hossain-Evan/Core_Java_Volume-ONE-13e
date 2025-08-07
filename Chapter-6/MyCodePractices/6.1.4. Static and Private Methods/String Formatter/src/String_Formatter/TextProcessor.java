package String_Formatter;

public class TextProcessor implements StringFormatter{

    public String format(String text){
        return StringFormatter.toTitleCase(text);
    }
}
