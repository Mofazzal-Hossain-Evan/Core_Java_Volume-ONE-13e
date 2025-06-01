package SuperSocietyDirectory;

public class ZooVerse {
    public static void main(String[] args) {
        Animal[] zoo = {
                new Parrot("Polly"),
                new Tiger("Sheru"),
                new Monkey("Momo"),
                new Dolphin("Dodo")
        };

        for (Animal a : zoo){
            System.out.println(a.getName()+" - " + a.getDescription());


        if (a instanceof Funny){
            System.out.println("Joke: " + ((Funny)a).tellAJoke());
        }  if (a instanceof Dangerous) {
                System.out.println("Threat: " + ((Dangerous)a).makeThreat());
            }
            if (a instanceof Singer) {
                System.out.println("Song: " + ((Singer)a).singSong());
            }

            System.out.println();
        }
    }
}
