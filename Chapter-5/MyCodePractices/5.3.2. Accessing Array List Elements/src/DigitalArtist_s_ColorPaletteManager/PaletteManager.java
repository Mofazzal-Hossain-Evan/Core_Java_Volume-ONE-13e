package DigitalArtist_s_ColorPaletteManager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PaletteManager {
    private static  final Scanner scanner = new Scanner(System.in);
    private static List<ColorPalette> palettes = new ArrayList<>();
    private static  final String FILE_NAME = "palettes.ser";

    public static void main(String[] args) {
        loadFromFile();
        boolean running = true;
        while (running){
            // User menu
            System.out.println("\n🎨 Color Palette Manager");
            System.out.println("1. Create New Palette");
            System.out.println("2. Add Color to Palette");
            System.out.println("3. Add Predefined Theme");
            System.out.println("4. Generate Random Color");
            System.out.println("5. View Palettes and Stats");
            System.out.println("6. Search Colors");
            System.out.println("7. Save to File");
            System.out.println("8. Load from File");
            System.out.println("9. Exit");
            System.out.print("Choose an option (1-9): ");
            int choice = scanner.nextInt(); scanner.nextLine();

            switch (choice){
                case 1 -> createPalette();
                case 2 -> addColorToPalette();
                case 3 -> addPredefinedTheme();
                case 4 -> generateRandomColor();
                case 5 -> showPalettesAndStats();
                case 6 -> searchColors();
                case 7 -> saveToFile();
                case 8 -> loadFromFile();
                case  9 -> {running = false;
                    System.out.println("👋 Goodbye!");}
                default -> System.out.println("❗ Invalid option.");
            }
        }
    }

    static void createPalette() {
        System.out.print("Enter palette name: ");
        String name = scanner.nextLine();

        // Check for duplicate palette names (optional but useful)
        for (ColorPalette p : palettes) {
            if (p.getName().equalsIgnoreCase(name)) {
                System.out.println("❗ A palette with this name already exists.");
                return;
            }
        }

        ColorPalette newPalette = new ColorPalette(name);
        palettes.add(newPalette);
        System.out.println("🎨 Palette '" + name + "' created successfully!");
    }

    static void generateRandomColor(){
        String[] names = {"Funky Blue", "Neon Green", "Lava Red", "Mystery Gray", "Bubblegum Pink"};
        Random rand = new Random();
        int r = rand.nextInt(256), g = rand.nextInt(256), b = rand.nextInt(256);
        String name = names[rand.nextInt(names.length)] + " (" + r + "," + g + "," + b + ")";
        showPalettes();
        System.out.println("Choose palette to add random color: ");
        int index = scanner.nextInt() -1;scanner.nextLine();
        if (validIndex(index, palettes.size())){
            palettes.get(index).addColor(new Color(name, r,g,b));
            System.out.println("✨ Random color added!");
        }
    }

    static void showPalettesAndStats(){
        if (palettes.isEmpty()) {
            System.out.println("⚠️ No palettes."); return;
        }
        for (ColorPalette P : palettes){
            System.out.println("\n" + P);
        for (Color C : P.getColors()) System.out.println("   • " + C);
        double[] avg = P.averageRGB();
            System.out.printf("  AVG RGB: (%.1f, %.1f, %.1f)\n", avg[0], avg[1],avg[2]);
        }
    }
    static void addPredefinedTheme() {
        if (palettes.isEmpty()) {
            System.out.println("⚠️ No palettes to apply theme.");
            return;
        }
        showPalettes();
        System.out.print("Choose palette: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();
        if (!validIndex(index, palettes.size())) {
            System.out.println("❌ Invalid index.");
            return;
        }

        System.out.println("Available themes: ");
        System.out.println("1. Sunset Glow");
        System.out.println("2. Ocean Breeze");
        System.out.println("3. Forest Earth");

        System.out.print("Choose theme: ");
        int theme = scanner.nextInt(); scanner.nextLine();

        List<Color> themeColors = new ArrayList<>();
        switch (theme) {
            case 1 -> {
                themeColors.add(new Color("Sunset Orange", 255, 94, 77));
                themeColors.add(new Color("Golden Glow", 255, 204, 102));
                themeColors.add(new Color("Twilight Purple", 153, 102, 204));
            }
            case 2 -> {
                themeColors.add(new Color("Sky Blue", 135, 206, 250));
                themeColors.add(new Color("Sea Green", 46, 139, 87));
                themeColors.add(new Color("Coral", 255, 127, 80));
            }
            case 3 -> {
                themeColors.add(new Color("Leaf Green", 34, 139, 34));
                themeColors.add(new Color("Earth Brown", 139, 69, 19));
                themeColors.add(new Color("Stone Gray", 112, 128, 144));
            }
            default -> {
                System.out.println("❌ Invalid theme.");
                return;
            }
        }

        ColorPalette chosen = palettes.get(index);
        for (Color c : themeColors) chosen.addColor(c);
        System.out.println("🌈 Theme added!");
    }


    // Searches all palettes for matching color names or RGBs
    static void searchColors() {
        System.out.print("Enter color name or RGB to search: ");
        String keyword = scanner.nextLine();
        for (ColorPalette p : palettes) {
            List<Color> matches = p.search(keyword);
            if (!matches.isEmpty()) {
                System.out.println("\nIn palette: " + p.getName());
                for (Color c : matches) {
                    System.out.println("   🔍 " + c);
                }
            }
        }
    }

    static void addColorToPalette() {
        if (palettes.isEmpty()) {
            System.out.println("⚠️ No palettes to add color.");
            return;
        }
        showPalettes();
        System.out.print("Choose palette: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();
        if (validIndex(index, palettes.size())) {
            System.out.print("Color name: ");
            String name = scanner.nextLine();
            System.out.print("Red (0-255): ");
            int r = scanner.nextInt();
            System.out.print("Green (0-255): ");
            int g = scanner.nextInt();
            System.out.print("Blue (0-255): ");
            int b = scanner.nextInt();
            scanner.nextLine();
            palettes.get(index).addColor(new Color(name, r, g, b));
            System.out.println("✅ Color added.");
        } else {
            System.out.println("❌ Invalid index.");
        }
    }


    // Saves all palettes to a file
    static void saveToFile() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(palettes);
            System.out.println("💾 Saved successfully.");
        } catch (IOException e) {
            System.out.println("❌ Save failed.");
        }
    }

    // Loads palettes from file if it exists
    static void loadFromFile() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            palettes = (ArrayList<ColorPalette>) in.readObject();
            System.out.println("📂 Loaded successfully.");
        } catch (Exception e) {
            System.out.println("⚠️ No save file found or failed to load.");
        }
    }

    // Helper to list palettes by index
    static void showPalettes() {
        for (int i = 0; i < palettes.size(); i++) {
            System.out.println((i + 1) + ". " + palettes.get(i).getName());
        }
    }

    // Validates index within given size
    static boolean validIndex(int i, int size) {
        return i >= 0 && i < size;
    }
}
