package AIChatbotPersonalityTrainer;

public class ChatbotTest {
    public static void main(String[] args) {
        Chatbot friendly = new FriendlyBot();
        //even though the class name is Chatbot, but we are assigning it to an instance of FriendlyBot.
        //This is a concept called polymorphism in Java. Let’s break it down step by step.

        //FriendlyBot inherits from Chatbot. That means FriendlyBot is a type of Chatbot.

        Chatbot sarcastic = new SarcasticBot();

        System.out.println("FriendlyBot: " + friendly.respond("hello"));
        System.out.println("SarcasticBot: " + sarcastic.respond("Hello"));

    }
}
