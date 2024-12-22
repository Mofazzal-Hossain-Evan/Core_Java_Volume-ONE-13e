import java.util.Scanner;


public class MeatShop {

    public static final double BEEF_PRICE = 8.66;
    public static final double MUTTON_PRICE = 12.99; // Price per kg for mutton
    public static final double CHICKEN_PRICE = 5.49; // Price per kg for chicken
//
//
//    public static double calculate(double quantity, double priceKG)
//    {
//        return quantity*priceKG;
//    }
//
//    public static void main(String[] args)
//
//    {
//        double quantity;
//
//
//        Scanner answer = new Scanner(System.in);
//        double totalPrice = 0.0;
//
//        System.out.println("Welcome to the Meat Shop!");
//        System.out.println("We have the following items:");
//        System.out.println("1. Beef ($8.99/kg)");
//        System.out.println("2. Mutton ($12.99/kg)");
//        System.out.println("3. Chicken ($5.49/kg)");
//
//        System.out.println("Select items by typing the numbers (e.g., 1 for Beef). Enter 0 to finish selection.");
//
//        while(true)
//        {
//            System.out.println("Enter your choice: ");
//            int choise = answer.nextInt();
//
//            if(choise == 0)
//            {
//                break;
//            }
//
//            switch (choise)
//            {
//                case 1:
//                    System.out.println("How many kilograms of beef do you want? ");
//                    quantity = answer.nextDouble();
//                    totalPrice += calculate(quantity, BEEF_PRICE);
//                    break;
//
//                case 2:
//                    System.out.println("How many kilograms of mutton do you want? ");
//                    quantity = answer.nextDouble();
//                    totalPrice += calculate(quantity, MUTTON_PRICE);
//                    break;
//
//                case 3:
//                    System.out.println("How many kilograms Chicken do you want? ");
//                    quantity = answer.nextDouble();
//                    totalPrice += calculate(quantity, CHICKEN_PRICE);
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//
//        }
//
//        System.out.printf("Your total price is: $%.2%n", totalPrice);
//        System.out.println("Thank you for shopping with us! Have a great day!");
//        answer.close();
//
//    }
//
//
//

//it was WRONG

    public static double calculation(double quantity, double pricePerKg)
    {
        return quantity * pricePerKg;
    }

    public static void main(String[] args)
    {
        Scanner answer = new Scanner(System.in);
        double totalPrice = 0.0;

        System.out.println("Welcome to the Meat Shop!");
        System.out.println("We have the following items:");
        System.out.println("1. Beef ($8.99/kg)");
        System.out.println("2. Mutton ($12.99/kg)");
        System.out.println("3. Chicken ($5.49/kg)");

        System.out.println("Enter the numbers to select items (e.g., 1 for Beef). Enter 0 to finish.");

        boolean hasItems = false;

        while(true)
        {
            System.out.println("Enter your choice: ");
            int choise = answer.nextInt();

            if (choise == 0)
            {
                break;
            }

            double quantity;
            switch (choise)
            {
                case 1:
                    System.out.println("How many kilograms of beef do you want? ");
                    quantity = answer.nextDouble();
                    totalPrice += calculation(quantity, BEEF_PRICE);
                    hasItems = true;
                    break;

                case 2:
                    System.out.println("How many kilograms of mutton do you want? ");
                    quantity = answer.nextDouble();
                    totalPrice += calculation(quantity, MUTTON_PRICE);
                    hasItems = true;
                    break;

                case 3:
                    System.out.println("How many kilograms of chicken do you want? ");
                    quantity = answer.nextDouble();
                    totalPrice += calculation(quantity, CHICKEN_PRICE);
                    hasItems = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, 3, or 0 to finish.");
            }

            System.out.println("Would you like to add more items? (yes/no): ");
            String moreItems = answer.next();

            if (moreItems.equalsIgnoreCase("no"))
            {
                break;
            }

        }
           if (hasItems)
           {
               System.out.printf("Your total price is: $%.2f%n", totalPrice);
               System.out.println("Thank you for visiting!");
           } else {
               System.out.println("You did not purchase any items. Thank you for visiting!");
           }

           answer.close();

    }

}

