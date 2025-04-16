package DinoFleet_IntergalacticDinosaurDelivery;

import java.util.ArrayList;
import java.util.Comparator;

public class DinoFleetManager {

    private ArrayList<DinoOrder> orders = new ArrayList<>();

    public void addOrder(DinoOrder order){
        orders.add(order);
    }

    public void printAllOrders(){
        if (orders.isEmpty()){
            System.out.println("No orders yet: ");
        } else {
            for (DinoOrder o : orders){
                System.out.println(o);
            }
        }
    }

    public void searchPlanet(String planet){
        boolean found = false;
        for (DinoOrder o : orders){
            if (o.getPlanet().equalsIgnoreCase(planet)){
                System.out.println(o);
                found = true;
            }
        }
        if (!found)
            System.out.println("No orders found for planet: " + planet);
    }

    public int totalToPlanet(String planet){
        int total = 0;
        for (DinoOrder o : orders){
            if (o.getPlanet().equalsIgnoreCase(planet))
                total= o.getQuantity() + total;
        }
        return total;
    }
    public void sortOrdersByPlanet(){
        orders.sort(Comparator.comparing(DinoOrder::getPlanet));
    }
}
