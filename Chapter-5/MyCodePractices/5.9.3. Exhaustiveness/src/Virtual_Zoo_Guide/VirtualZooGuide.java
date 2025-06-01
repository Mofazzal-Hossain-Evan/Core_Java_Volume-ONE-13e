package Virtual_Zoo_Guide;

public class VirtualZooGuide {
    public static void main(String[] args) {
printAnimalInfo(new Lion());
printAnimalInfo(new Elephant());
printAnimalInfo(new Penguin());
    }

    static void printAnimalInfo(Animal animal){
        String info = switch (animal) {
            case Lion l -> "🦁 Lion says: " + l.roar();
            case Elephant e -> "🐘 Elephant says: "+ e.trumpet();
            case Penguin p -> "🐧 Penguin says: " + p.squeak();
        };
        System.out.println(info);
    }
}
