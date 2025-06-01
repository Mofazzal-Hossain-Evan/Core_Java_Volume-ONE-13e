package DinosaurDNAComparator;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        // 🎯 Traits
        String[] traits1 = {"Fast", "Carnivore"};
        String[] traits2 = {"Fast", "Carnivore"};
        char[][] dna1 = {
                {'A', 'T', 'G'},
                {'C', 'C', 'A'}
        };
        char[][] dna2 = {
                {'A', 'T', 'G'},
                {'C', 'C', 'A'}
        };
        char[][] dna3 = {
                {'G', 'G', 'G'},
                {'C', 'T', 'A'}
        };

        // 🧬 Dinosaur Instances
        Dinosaur rex1 = new Dinosaur("T-Rex", 101, LocalDate.of(2023, 7, 10), traits1, dna1);
        Dinosaur rex2 = new Dinosaur("T-Rex", 101, LocalDate.of(2023, 7, 10), traits2, dna2);
        Dinosaur spino = new Dinosaur("Spinosaurus", 202, LocalDate.of(2024, 3, 5), new String[]{"Swimmer"}, dna3);

        DeepComparer.compareObject(rex1, rex2);
        DeepComparer.compareObject(rex1, spino);
    }
}
