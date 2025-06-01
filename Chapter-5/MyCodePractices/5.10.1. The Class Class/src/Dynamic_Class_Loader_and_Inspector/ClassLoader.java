package Dynamic_Class_Loader_and_Inspector;

public class ClassLoader {
    public Class<?> loadclass(String className) throws ClassLoadingException{
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException e) {
            throw  new ClassLoadingException("Class not found: " + className, e);
        } catch (ExceptionInInitializerError e) {
            throw new ClassLoadingException("Error initializing class: " + className, e);
        } catch (LinkageError e){
            throw new ClassLoadingException("Error linking class: " + className, e);
        }
    }
}
