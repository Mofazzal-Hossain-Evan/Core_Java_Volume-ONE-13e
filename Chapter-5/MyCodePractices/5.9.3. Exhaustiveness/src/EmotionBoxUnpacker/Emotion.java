package EmotionBoxUnpacker;

sealed interface Emotion permits Joy, Anger, Confusion {}
final class Joy implements Emotion{}
final  class  Anger implements Emotion{}
final class Confusion implements Emotion{}

record Box<T>(T contents){}
