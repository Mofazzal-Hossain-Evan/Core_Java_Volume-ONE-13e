package NullCleaner;

import java.util.*;
import java.util.Objects;

public class NullCleaner {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>(Arrays.asList("Java", null, "Python", null, "C++"));
        data.removeIf(Objects::isNull);
        data.forEach(System.out::println);
    }
}
