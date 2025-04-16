package DinoFleet_IntergalacticDinosaurDelivery;

import java.util.Scanner;


public class DinoFleetApp {

    private static DinoFleetManager manager = new DinoFleetManager();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;



        while (running){
            printMenu();
            int choice = getInt("Enter your choice: ");
            switch (choice){
                case 1 -> addOrder();
                case 2 -> manager.printAllOrders();
                case 3 -> searchOrder();
                case 4 -> totalToPlanet();
                case 5 -> {
                    manager.sortOrdersByPlanet();
                    System.out.println("✅ Orders sorted by planet.");
                }
                case 6 -> {
                    System.out.println("👋 Exiting DinoFleet. Goodbye!");
                    running = false;
                }
                default   -> System.out.println("Invalid choice. Try again.");
            }

        }
    }
    private static void printMenu(){
        System.out.println("""
                \n🦖 Welcome to DinoFleet 🚀
                1. Add Order
                2. Show All Orders
                3. Search Orders by Planet
                4. Total Dinos to a Planet
                5. Sort Orders by Planet
                6. Exit
                """);
    }

    private static void addOrder(){
        System.out.println("Enter planet name: ");
        String planet = scanner.nextLine();

        System.out.print("Enter dinosaur type: ");
        String dino = scanner.nextLine();

        int qty = getInt("Enter quantity: ");
manager.addOrder(new DinoOrder(planet,dino,qty));
        System.out.println("✅ Order added.");
    }
    private  static  void searchOrder(){
        System.out.println("Enter planet to search: ");
        String planet = scanner.nextLine();
        manager.searchPlanet(planet);
    }
    private static void totalToPlanet() {
        System.out.print("Enter planet: ");
        String planet = scanner.nextLine();
        int total = manager.totalToPlanet(planet);
        System.out.println("Total dinos going to " + planet + ": " + total);
    }

    private static int getInt(String prompt){
        System.out.println(prompt);
        while (!scanner.hasNextLine()){
            System.out.println("Please Enter a Number: ");
            scanner.next(); //discard invalid input
        }
        int val = scanner.nextInt();
        scanner.nextLine();
        return  val;
    }
}

