package ZooSystem;

import java.io.*;
import java.util.*;

public class ZooStore {

    private Animal[] animals;

    public ZooStore(String eaglePath, String sharkPath,
                    String cheetahPath, String duckPath) {
        List<Animal> list = new ArrayList<>();
        list.addAll(load(eaglePath,   "Eagle"));
        list.addAll(load(sharkPath,   "Shark"));
        list.addAll(load(cheetahPath, "Cheetah"));
        list.addAll(load(duckPath,    "Duck"));
        this.animals = list.toArray(new Animal[0]);
    }

    private List<Animal> load(String path, String type) {
        List<Animal> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            br.readLine(); // header skip
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split(",");
                String name    = p[0].trim();
                int age        = Integer.parseInt(p[1].trim());
                double weight  = Double.parseDouble(p[2].trim());
                String habitat = p[3].trim();

                result.add(switch (type) {
                    case "Eagle"   -> new Eagle(name, age, weight, habitat);
                    case "Shark"   -> new Shark(name, age, weight, habitat);
                    case "Cheetah" -> new Cheetah(name, age, weight, habitat);
                    case "Duck"    -> new Duck
                            (name, age, weight, habitat);
                    default        -> throw new IllegalArgumentException("Unknown: " + type);
                });
            }
        } catch (IOException e) {
            System.out.println("CSV error [" + path + "]: " + e.getMessage());
        }
        return result;
    }

    public Animal[] getAnimals() { return animals; }
}