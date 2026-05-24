package PetShopSystem;

public final class Tiger extends Pet
        implements Cuddlable, Wildable, Comparable<Tiger> {

    // 💡 6.1.3 — দুটো interface একসাথে
    // Cuddlable এ body নেই, Wildable এ body নেই
    // Tiger নিজে সব লেখে → Diamond Problem নেই
    //
    // কেন extends Cuddlable, Wildable করা যায় না?
    // class Tiger extends Cuddlable, Wildable → COMPILE ERROR!
    // দুই বাবা হয় না

    public Tiger(String name, int age,
                 double price, String species) {
        super(name, age, price, species);
    }

    @Override
    public String getPetType() { return "Tiger"; }

    @Override
    public void train(String trick) {
        System.out.println(name + " roars at: " + trick + " 🐯");
    }

    @Override
    public void feed(String food) {
        System.out.println(name + " devouring " + food + " 🥩");
    }

    @Override
    public void cuddle(int minutes) {
        System.out.println(name + " tolerates cuddle for " + minutes + " mins 😬");
    }

    @Override
    public void growl(int volume) {
        if (volume > MAX_GROWL) {
            System.out.println(name + " ROARS at " + volume + " — Run! ❌");
        } else {
            System.out.println(name + " growls at " + volume + " 🐾");
        }
    }

    @Override
    public Trainable getJuniorVersion() {
        return new Tiger("Cub " + name, 0, price * 0.6, species);
    }

    @Override
    public int compareTo(Tiger other) {
        return Double.compare(price, other.price);
    }
}