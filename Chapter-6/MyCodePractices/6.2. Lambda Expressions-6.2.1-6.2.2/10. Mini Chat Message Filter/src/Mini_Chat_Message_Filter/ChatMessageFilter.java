package Mini_Chat_Message_Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChatMessageFilter {
    public static void main(String[] args) {

        List<String> message = Arrays.asList(
                "Connection established",
                "Error: Failed to load file",
                "User logged in",
                "error: invalid input"
        );

        message.stream()
                .filter(m->m.toLowerCase().contains(""))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
