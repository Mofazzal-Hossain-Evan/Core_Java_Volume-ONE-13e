package EcoReserveEmployeeManager;

import java.util.ArrayList;

public class EcoReserveEmployeeManager {
    public static void main(String[] args) {

        ArrayList<Employee> reserveStaff = new ArrayList<>();

        //add new method
        reserveStaff.add(new Employee("Dr. Aranya", 301, "Biologist", "Sundarbans", 58000));
        reserveStaff.add(new Employee("Vet Rina", 412, "Veterinarian", "Kaziranga", 64000));
        reserveStaff.add(new Employee("Ranger Nipun", 229, "Ranger", "Amazon", 50000));

        //ensure capacity
        reserveStaff.ensureCapacity(100);

        //size
        System.out.println("🌿 Total Active Staff: " + reserveStaff.size());

        //✅ Raw Type (simulate legacy wildlife records)
        ArrayList legacyDate = LegacyDataLoader.load();

        // ✅ var + diamond issue
        var unknownList = new ArrayList<>(); // becomes ArrayList<Object>
        unknownList.add("Tiger observation error");

        //trimTOSize
        reserveStaff.trimToSize();;

        //print all staff
        System.out.println("\n🌳 Active Staff Roster:");
        for (Employee e : reserveStaff) {
            System.out.println(" - " + e);
        }


    }
}
