package Dynamic_Class_Loader_and_Inspector;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ClassInspector {
    public void displayGeneralInfo(Class<?> clazz) {
        System.out.println("\n===== General Information =====");
        System.out.println("Class name: " + clazz.getName());
        System.out.println("Simple name: " + clazz.getSimpleName());
        System.out.println("Package: " + (clazz.getPackage() != null ? clazz.getPackage().getName() : "default package"));
        System.out.println("Is interface: " + clazz.isInterface());
        System.out.println("Is enum: " + clazz.isEnum());
        System.out.println("Is array: " + clazz.isArray());
        System.out.println("Is primitive: " + clazz.isPrimitive());
        
        int modifiers = clazz.getModifiers();
        System.out.println("Modifiers: " + Modifier.toString(modifiers));
    }
    
    public void displayConstructors(Class<?> clazz) {
        System.out.println("\n===== Constructors =====");
        Constructor<?>[] constructors = clazz.getConstructors();
        
        if (constructors.length == 0) {
            System.out.println("No public constructors found.");
        } else {
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor);
            }
        }
    }
    
    public void displayMethods(Class<?> clazz) {
        System.out.println("\n===== Methods =====");
        Method[] methods = clazz.getDeclaredMethods();
        
        if (methods.length == 0) {
            System.out.println("No methods found.");
        } else {
            for (Method method : methods) {
                System.out.println(Modifier.toString(method.getModifiers()) + " " + 
                                  method.getReturnType().getSimpleName() + " " + 
                                  method.getName() + getParametersAsString(method.getParameterTypes()));
            }
        }
    }
    
    public void displayFields(Class<?> clazz) {
        System.out.println("\n===== Fields =====");
        Field[] fields = clazz.getDeclaredFields();
        
        if (fields.length == 0) {
            System.out.println("No fields found.");
        } else {
            for (Field field : fields) {
                System.out.println(Modifier.toString(field.getModifiers()) + " " + 
                                  field.getType().getSimpleName() + " " + 
                                  field.getName());
            }
        }
    }
    
    public void displaySuperclassHierarchy(Class<?> clazz) {
        System.out.println("\n===== Superclass Hierarchy =====");
        
        Class<?> current = clazz;
        int level = 0;
        
        while (current != null) {
            System.out.println("Level " + level + ": " + current.getName());
            current = current.getSuperclass();
            level++;
        }
    }
    
    public void displayInterfaces(Class<?> clazz) {
        System.out.println("\n===== Implemented Interfaces =====");
        Class<?>[] interfaces = clazz.getInterfaces();
        
        if (interfaces.length == 0) {
            System.out.println("No interfaces implemented directly.");
        } else {
            for (Class<?> iface : interfaces) {
                System.out.println(iface.getName());
            }
        }
    }
    
    private String getParametersAsString(Class<?>[] parameterTypes) {
        StringBuilder sb = new StringBuilder("(");
        
        for (int i = 0; i < parameterTypes.length; i++) {
            sb.append(parameterTypes[i].getSimpleName());
            if (i < parameterTypes.length - 1) {
                sb.append(", ");
            }
        }
        
        sb.append(")");
        return sb.toString();
    }
}
