package GreatInventionsTimeline;

public class InventionTimeLine {

    public static void main(String[] args) {
        Invention telephone = new Invention();

        telephone.displayInfo();
        try {
            int year = telephone.discoveryDate.getYear();
            System.out.println("Year of Discovery: " + year);
        } catch (NullPointerException e){
            System.out.println("Error: Cannot retrieve year from a null date!");
        }
    }
}
