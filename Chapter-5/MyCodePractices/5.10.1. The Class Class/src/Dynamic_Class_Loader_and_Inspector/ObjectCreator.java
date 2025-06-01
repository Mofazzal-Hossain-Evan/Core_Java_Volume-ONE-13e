package Dynamic_Class_Loader_and_Inspector;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreator {

    public Object createWithDefaultConstructor(Class<?> clazz) throws ObjectCreationException {
        try {
            return clazz.getDeclaredConstructor().newInstance();
        } catch (NoSuchMethodException e) {
            throw new ObjectCreationException("No default constructor available for " + clazz.getName(), e);
        } catch (InstantiationException e) {
            throw new ObjectCreationException("Cannot instantiate " + clazz.getName() + " (abstract class?)", e);
        } catch (IllegalAccessException e) {
            throw new ObjectCreationException("Cannot access constructor for " + clazz.getName(), e);
        } catch (InvocationTargetException e) {
            throw new ObjectCreationException("Constructor threw an exception", e.getTargetException());
        }
    }

    public Object createWithConstructor(Constructor<?> constructor, Object[] args) throws ObjectCreationException {
        try {
            return constructor.newInstance(args);
        } catch (InstantiationException e) {
            throw new ObjectCreationException("Cannot instantiate class (abstract class?)", e);
        } catch (IllegalAccessException e) {
            throw new ObjectCreationException("Cannot access constructor", e);
        } catch (InvocationTargetException e) {
            throw new ObjectCreationException("Constructor threw an exception", e.getTargetException());
        } catch (IllegalArgumentException e) {
            throw new ObjectCreationException("Invalid arguments for constructor", e);
        }
    }
}
