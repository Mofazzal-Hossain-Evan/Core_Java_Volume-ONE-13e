package TheSuperSocietyDirectory;

 class SuperSociety {
    public static void main(String[] args) {
        Person[] members = new Person[5];
        members[0] = new Hero("Captain Kindness", "laser hugs", 2020, 5, 20);
        members[1] = new Villain("Dr. Doomscroll", 99);
        members[2] = new Scientist("Professor Puzzler", "Quantum Cupcakes");
        members[3] = new Sidekick("GiggleBoy", "punny");


        for (Person p : members) {
            if (p != null) {
                System.out.println("👤 " + p.getName());
                System.out.println("🧾 " + p.getDescription());
            } else {
                System.out.println("⚠️ Warning: Null object found in array.");
            }

            if (p instanceof Funny) {
                System.out.println("😂 Joke: " + ((Funny)p).tellAJoke());
            }

            if (p instanceof Dangerous) {
                System.out.println("⚠️ Warning: " + ((Dangerous)p).getWarning());
            }

            if (p instanceof Genius) {
                System.out.println("🧠 Invention: " + ((Genius)p).makeInvention());
            }

            System.out.println("--------------");
        }
    }
}
