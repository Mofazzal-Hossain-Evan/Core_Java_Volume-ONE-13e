package Enum_Array_Inspector;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EnumArrayInspector {

    public static void main(String[] args) {
        System.out.println("🧪 ENUM INSPECTION:");
        Size sz = Size.SMALL;

        System.out.println("Enum Constant: " + sz);
        System.out.println("Enum class: " + sz.getClass().getName());
        System.out.println("Enum == Size.class ? " + (sz.getClass() == Size.class));
        System.out.println("Enum instanceof Enum ? " + (sz instanceof Enum));
        System.out.println("Enum superclass: " + sz.getClass().getSuperclass());

        System.out.println("\nAll Enum Constants:");
        for (Size s : Size.values()){
            System.out.println("  _  " + s + " (class: " + s.getClass().getName() + ")");
        }

        // 🧮 Using valueOf
        System.out.println("\nUsing Enum.valueOf:");
        Size picked = Enum.valueOf(Size.class, "LARGE");
        System.out.println("Picked: " + picked);

        // 🧊 Enum class object identity test
        System.out.println("\n✅ Size.class == sz.getClass(): " + (Size.class == sz.getClass()));
        System.out.println("✅ Size.class == Size.SMALL.getDeclaringClass(): " + (Size.class == Size.SMALL.getDeclaringClass()));

        // 🧪 ARRAY TYPE INSPECTION
        System.out.println("\n📦 ARRAY INSPECTION:");

        Class<?> doubleArrayClass = Double[].class;
        Class<?> intArrayClass = int[].class;

        System.out.println("Double[].class name: " + doubleArrayClass.getName());
        System.out.println("int[].class name: " + intArrayClass.getName());

        System.out.println("\n🔧 Creating arrays reflectively:");
        Object strArray = Array.newInstance(String.class, 3);
        Array.set(strArray, 0, "Hello");
        Array.set(strArray, 1, "Reflection");
        Array.set(strArray, 2, "Array");

        System.out.println("String[] via reflection: " + Arrays.toString((Object[]) strArray));

        Object intArray = Array.newInstance(int.class, 4);
        for (int i = 0; i < 4; i++) {
            Array.setInt(intArray, i, i * i);
        }

        System.out.println("int[] via reflection: " + Arrays.toString((int[]) intArray));




    }
}
