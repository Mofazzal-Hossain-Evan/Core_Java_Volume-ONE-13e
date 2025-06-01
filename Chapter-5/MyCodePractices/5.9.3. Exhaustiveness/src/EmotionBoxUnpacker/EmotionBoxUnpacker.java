package EmotionBoxUnpacker;

public class EmotionBoxUnpacker {
    public static void main(String[] args) {

        Box<Emotion> box1 = new Box<>(new Joy());
        Box<Emotion> box2 = new Box<>(new Anger());
        Box<Emotion> box3 = new Box<>(new Confusion());
        Box<Emotion> box4 = new Box<>(null);
        Box<Emotion> box5 = null;
        System.out.println(unpack(box1));
        System.out.println(unpack(box2));
        System.out.println(unpack(box3));
        System.out.println(unpack(box4));
        System.out.println(unpack(box5));

    }

    public static String unpack(Box<Emotion> emotionBox) {
        if (emotionBox == null) return "💔 The emotion box itself is missing!";
        if (emotionBox.contents() == null) return "❌ No emotion inside!";

        return switch (emotionBox.contents()) {
            case Joy j       -> "😊 Joy detected: Spread the happiness!";
            case Anger a     -> "😠 Anger detected: Take a deep breath.";
            case Confusion c -> "😕 Confusion detected: Let's find clarity.";
        };
    }
}
