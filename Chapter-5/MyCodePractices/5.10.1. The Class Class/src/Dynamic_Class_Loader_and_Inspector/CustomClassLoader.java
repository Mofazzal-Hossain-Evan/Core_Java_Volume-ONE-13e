package Dynamic_Class_Loader_and_Inspector;

public class CustomClassLoader {  // Renamed the class
    public Class<?> loadClass(String className) throws ClassLoadingException {
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException e) {
            throw new ClassLoadingException("Class not found: " + className, e);
        } catch (ExceptionInInitializerError e) {  // Explicitly handle ExceptionInInitializerError
            throw new ClassLoadingException("Error initializing class: " + className, e);
        } catch (LinkageError e) {
            throw new ClassLoadingException("Error linking class: " + className, e);
        } catch (Throwable e) {  // Catch any other exceptions or errors that were not already caught
            throw new ClassLoadingException("Unexpected error while loading class: " + className, e);
        }
    }
}
