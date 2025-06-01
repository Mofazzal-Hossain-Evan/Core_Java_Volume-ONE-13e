package Runtime_Object_Cloner;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;

public class RuntimeObjectCloner {
    public static Object deepClone(Object original) throws Exception{
        return  deepCloneInternal(original, new IdentityHashMap<>());
    }

    private  static Object deepCloneInternal(Object original, Map<Object, Object> visited) throws Exception{
if (original == null) return null;

if (visited.containsKey(original)){
    return visited.get(original);
}
Class<?> clazz = original.getClass();
    if (clazz.isPrimitive() || clazz == String.class || Number.class.isAssignableFrom(clazz) ||
    clazz == Boolean.class){
        return original;
    }
    if (clazz.isArray()){
        int length = Array.getLength(original);
        Object copy = Array.newInstance(clazz.getComponentType(), length);
        visited.put(original, copy);

        for (int i = 0; i < length; i++ ){
            Object value = Array.get(original, i);
            Object cloneValue = deepCloneInternal(value, visited);
            Array.set(copy, i, cloneValue);
        }
        return copy;
    }

        Constructor<?> constructor = clazz.getDeclaredConstructor();
    constructor.setAccessible(true);
    Object copy = constructor.newInstance();
    visited.put(original, copy);

    while (clazz != null){
        for (Field field : clazz.getDeclaredFields()){
            field.setAccessible(true);

            if (!Modifier.isStatic(field.getModifiers()) && !Modifier.isFinal(field.getModifiers())){
                Object fieldValue = field.get(original);
                Object clonedValue = deepCloneInternal(fieldValue, visited);
                field.set(copy, clonedValue);
            }
        }
        clazz = clazz.getSuperclass();
    }
    return copy;
    }
    // মেইন মেথড – টেস্ট করার জন্য
    public static void main(String[] args) throws Exception {
        class Person {
            String name = "Evan";
            int age = 22;
            Address address = new Address("Dhaka");
        }

        Person original = new Person();
        Person cloned = (Person) deepClone(original);

        System.out.println("Original: " + original.address.city);
        System.out.println("Cloned: " + cloned.address.city);

        // চেক করি যে আলাদা রেফারেন্স আছে কিনা
        System.out.println("Same object? " + (original == cloned));
        System.out.println("Same address? " + (original.address == cloned.address));
    }

    private static class Address {
        String city;
        // No-argument constructor
        Address() {}
        Address(String city) { this.city = city; }
    }
}

