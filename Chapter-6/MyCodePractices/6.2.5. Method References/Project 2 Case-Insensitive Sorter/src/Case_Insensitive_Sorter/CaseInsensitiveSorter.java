package Case_Insensitive_Sorter;

import java.util.*;

public class CaseInsensitiveSorter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Evan", "mofazzal", "ALi", "rana");
        names.sort(String::compareToIgnoreCase);
        names.forEach(System.out::println);
    }
}
