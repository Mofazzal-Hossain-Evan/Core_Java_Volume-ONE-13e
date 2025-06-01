package ZooJSONProject;

public class ZooMain {
    public static void main(String[] args) {
        ZooObject zoo = new ZooObject();

        zoo.put("lion", new ZooLion("Simba"));
        zoo.put("tiger", new ZooTiger("Sher Khan"));
        zoo.put("parrot", new ZooParrot("Who's a pretty bird?"));
        zoo.put("elephant", new ZooElephant("Dumbo"));
        zoo.put("snake", new ZooSnake("Python"));

        ZooArray mixed = new ZooArray();
        mixed.add(new ZooLion("Mini Simba"));
        mixed.add(ZooVoid.INSTANCE);
        mixed.add(new ZooParrot("I can code in Java!"));

        zoo.put("others", mixed);

        System.out.println(zoo);
        System.out.println("\n--- Sounds ---");
        for (ZooValue zv : zoo.values()) {
            System.out.println(zv.sound());
        }
    }
}
