import java.util.Arrays;

public class ArrayBackupRestore {
    
    public static void main(String[] args) {
        int[] original= {1, 2, 3, 4, 5};
        int[] backup =Arrays.copyOf(original, original.length);
        
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Backup: " + Arrays.toString(backup));
        
        original[2] = 99;
        System.out.println("\nModified Original: " + Arrays.toString(original));
        System.out.println("Backup remains unchanged: " + Arrays.toString(backup));
        
        original = Arrays.copyOf(backup, backup.length);
        System.out.println("\nOriginal restored: " + Arrays.toString(original));

    }
    
}
