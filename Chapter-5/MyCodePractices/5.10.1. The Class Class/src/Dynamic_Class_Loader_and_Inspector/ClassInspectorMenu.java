package Dynamic_Class_Loader_and_Inspector;

import java.util.Scanner;
import java.lang.reflect.Constructor;

public class ClassInspectorMenu {
    private final Scanner scanner;
    private final CustomClassLoader classLoader;
    private final ClassInspector classInspector;
    private final ObjectCreator objectCreator;
    private final MethodInvoker methodInvoker;
    private final ExceptionAnalyzer exceptionAnalyzer;

    private Object currentObject = null;
    private Class<?> currentClass = null;

    public ClassInspectorMenu() {
        scanner = new Scanner(System.in);
        classLoader = new CustomClassLoader();
        classInspector = new ClassInspector();
        objectCreator = new ObjectCreator();
        methodInvoker = new MethodInvoker();
        exceptionAnalyzer = new ExceptionAnalyzer();
    }

    public void start() {
        boolean exit = false;
        while (!exit) {
            displayMainMenu();
            int choice = readIntInput(1, 7);

            try {
                switch (choice) {
                    case 1:
                        loadClass();
                        break;
                    case 2:
                        inspectCurrentClass();
                        break;
                    case 3:
                        createObject();
                        break;
                    case 4:
                        invokeMethod();
                        break;
                    case 5:
                        analyzeException();
                        break;
                    case 6:
                        demonstrateCustomExceptions();
                        break;
                    case 7:
                        exit = true;
                        System.out.println("Exiting the application. Goodbye!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
                e.printStackTrace();
            }

            if (!exit) {
                System.out.println("\nPress Enter to continue...");
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    private void displayMainMenu() {
        System.out.println("\n===== Dynamic Class Inspector =====");
        System.out.println("Current class: " + (currentClass != null ? currentClass.getName() : "None"));
        System.out.println("Current object: " + (currentObject != null ? currentObject : "None"));
        System.out.println("\nPlease select an option:");
        System.out.println("1. Load a class");
        System.out.println("2. Inspect current class");
        System.out.println("3. Create an object");
        System.out.println("4. Invoke a method");
        System.out.println("5. Analyze an exception");
        System.out.println("6. Demonstrate custom exceptions");
        System.out.println("7. Exit");
        System.out.print("Your choice: ");
    }

    private void loadClass() {
        System.out.print("Enter the fully qualified class name (e.g., java.util.ArrayList): ");
        String className = scanner.nextLine();

        try {
            currentClass = classLoader.loadClass(className);
            currentObject = null; // Reset current object when a new class is loaded
            System.out.println("Successfully loaded class: " + currentClass.getName());
        } catch (ClassLoadingException e) {
            System.out.println("Failed to load class: " + e.getMessage());
            if (e.getCause() != null) {
                System.out.println("Cause: " + e.getCause().getMessage());
            }
        }
    }

    private void inspectCurrentClass() {
        if (currentClass == null) {
            System.out.println("No class is currently loaded. Please load a class first.");
            return;
        }

        System.out.println("\n===== Class Inspection Menu =====");
        System.out.println("1. Show general information");
        System.out.println("2. List constructors");
        System.out.println("3. List methods");
        System.out.println("4. List fields");
        System.out.println("5. Show superclass hierarchy");
        System.out.println("6. Show implemented interfaces");
        System.out.println("7. Back to main menu");
        System.out.print("Your choice: ");

        int choice = readIntInput(1, 7);

        switch (choice) {
            case 1:
                classInspector.displayGeneralInfo(currentClass);
                break;
            case 2:
                classInspector.displayConstructors(currentClass);
                break;
            case 3:
                classInspector.displayMethods(currentClass);
                break;
            case 4:
                classInspector.displayFields(currentClass);
                break;
            case 5:
                classInspector.displaySuperclassHierarchy(currentClass);
                break;
            case 6:
                classInspector.displayInterfaces(currentClass);
                break;
            case 7:
                return;
        }
    }

    private void createObject() {
        if (currentClass == null) {
            System.out.println("No class is currently loaded. Please load a class first.");
            return;
        }

        try {
            System.out.println("\n===== Object Creation =====");
            System.out.println("1. Create using default constructor");
            System.out.println("2. Create using a specific constructor");
            System.out.println("3. Back to main menu");
            System.out.print("Your choice: ");

            int choice = readIntInput(1, 3);

            switch (choice) {
                case 1:
                    currentObject = objectCreator.createWithDefaultConstructor(currentClass);
                    System.out.println("Object created: " + currentObject);
                    break;
                case 2:
                    Constructor<?>[] constructors = currentClass.getConstructors();

                    if (constructors.length == 0) {
                        System.out.println("No public constructors available for this class.");
                        return;
                    }

                    System.out.println("Available constructors:");
                    for (int i = 0; i < constructors.length; i++) {
                        System.out.println((i + 1) + ". " + constructors[i]);
                    }

                    System.out.print("Select a constructor (1-" + constructors.length + "): ");
                    int constructorIndex = readIntInput(1, constructors.length) - 1;

                    Constructor<?> constructor = constructors[constructorIndex];
                    Class<?>[] paramTypes = constructor.getParameterTypes();
                    Object[] params = new Object[paramTypes.length];

                    for (int i = 0; i < paramTypes.length; i++) {
                        System.out.print("Enter value for parameter " + (i + 1) + " (" + paramTypes[i].getSimpleName() + "): ");
                        params[i] = readParameter(paramTypes[i]);
                    }

                    currentObject = objectCreator.createWithConstructor(constructor, params);
                    System.out.println("Object created: " + currentObject);
                    break;
                case 3:
                    return;
            }
        } catch (ObjectCreationException e) {
            System.out.println("Failed to create object: " + e.getMessage());
            if (e.getCause() != null) {
                System.out.println("Cause: " + e.getCause().getMessage());
            }
        }
    }

    private void invokeMethod() {
        if (currentObject == null) {
            System.out.println("No object is currently available. Please create an object first.");
            return;
        }

        try {
            java.lang.reflect.Method[] methods = currentObject.getClass().getMethods();

            System.out.println("\n===== Available Methods =====");
            for (int i = 0; i < methods.length; i++) {
                System.out.println((i + 1) + ". " + methods[i]);
            }

            System.out.print("Select a method (1-" + methods.length + "): ");
            int methodIndex = readIntInput(1, methods.length) - 1;

            java.lang.reflect.Method method = methods[methodIndex];
            Class<?>[] paramTypes = method.getParameterTypes();
            Object[] params = new Object[paramTypes.length];

            for (int i = 0; i < paramTypes.length; i++) {
                System.out.print("Enter value for parameter " + (i + 1) + " (" + paramTypes[i].getSimpleName() + "): ");
                params[i] = readParameter(paramTypes[i]);
            }

            Object result = methodInvoker.invokeMethod(currentObject, method, params);
            System.out.println("Method invocation result: " + result);
        } catch (MethodInvocationException e) {
            System.out.println("Failed to invoke method: " + e.getMessage());
            if (e.getCause() != null) {
                System.out.println("Cause: " + e.getCause().getMessage());
            }
        }
    }

    private void analyzeException() {
        System.out.println("\n===== Exception Analysis =====");
        System.out.println("1. Check if an exception is checked or unchecked");
        System.out.println("2. Display exception hierarchy");
        System.out.println("3. Back to main menu");
        System.out.print("Your choice: ");

        int choice = readIntInput(1, 3);

        if (choice == 3) {
            return;
        }

        System.out.print("Enter the fully qualified exception name (e.g., java.io.IOException): ");
        String exceptionName = scanner.nextLine();

        try {
            Class<?> exceptionClass = Class.forName(exceptionName);

            if (!Throwable.class.isAssignableFrom(exceptionClass)) {
                System.out.println(exceptionName + " is not an exception type!");
                return;
            }

            @SuppressWarnings("unchecked")
            Class<? extends Throwable> throwableClass = (Class<? extends Throwable>) exceptionClass;

            if (choice == 1) {
                boolean isChecked = exceptionAnalyzer.isCheckedException(throwableClass);
                System.out.println(exceptionName + " is a " + (isChecked ? "checked" : "unchecked") + " exception.");
            } else if (choice == 2) {
                exceptionAnalyzer.displayExceptionHierarchy(throwableClass);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Exception class not found: " + e.getMessage());
        }
    }

    private void demonstrateCustomExceptions() {
        System.out.println("\n===== Custom Exceptions Demo =====");
        System.out.println("1. Throw checked exception");
        System.out.println("2. Throw unchecked exception");
        System.out.println("3. Demonstrate exception chaining");
        System.out.println("4. Back to main menu");
        System.out.print("Your choice: ");

        int choice = readIntInput(1, 4);

        try {
            switch (choice) {
                case 1:
                    throw new CheckedBusinessException("This is a demonstration of a checked exception");
                case 2:
                    throw new UncheckedBusinessException("This is a demonstration of an unchecked exception");
                case 3:
                    try {
                        // Try something that might fail
                        if (currentClass == null) {
                            throw new IllegalStateException("No class is loaded");
                        }

                        // This would only happen if currentClass isn't null
                        throw new CheckedBusinessException("Original exception");
                    } catch (Exception e) {
                        // Chain the exception
                        throw new BusinessOperationException("Operation failed", e);
                    }
                case 4:
                    return;
            }
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getClass().getName());
            System.out.println("Message: " + e.getMessage());

            if (e.getCause() != null) {
                System.out.println("Cause: " + e.getCause().getClass().getName());
                System.out.println("Cause message: " + e.getCause().getMessage());
            }

            // Display the exception hierarchy
            System.out.println("\nException hierarchy:");
            exceptionAnalyzer.displayExceptionHierarchy(e.getClass());
        }
    }

    private int readIntInput(int min, int max) {
        int value;
        while (true) {
            try {
                String input = scanner.nextLine();
                value = Integer.parseInt(input);
                if (value >= min && value <= max) {
                    break;
                } else {
                    System.out.print("Please enter a number between " + min + " and " + max + ": ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
        return value;
    }

    private Object readParameter(Class<?> type) {
        String input = scanner.nextLine();

        try {
            if (type == String.class) {
                return input;
            } else if (type == int.class || type == Integer.class) {
                return Integer.parseInt(input);
            } else if (type == long.class || type == Long.class) {
                return Long.parseLong(input);
            } else if (type == double.class || type == Double.class) {
                return Double.parseDouble(input);
            } else if (type == float.class || type == Float.class) {
                return Float.parseFloat(input);
            } else if (type == boolean.class || type == Boolean.class) {
                return Boolean.parseBoolean(input);
            } else if (type == char.class || type == Character.class) {
                return input.isEmpty() ? '\0' : input.charAt(0);
            } else if (type == byte.class || type == Byte.class) {
                return Byte.parseByte(input);
            } else if (type == short.class || type == Short.class) {
                return Short.parseShort(input);
            } else {
                System.out.println("Complex type detected. Using null.");
                return null;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for parameter of type " + type.getSimpleName() + ". Returning null.");
            return null;
        }
    }
}
