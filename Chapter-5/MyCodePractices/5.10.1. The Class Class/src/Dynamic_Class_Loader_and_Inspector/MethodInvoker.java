package Dynamic_Class_Loader_and_Inspector;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodInvoker {

    public Object invokeMethod(Object target, Method method, Object[] args) throws MethodInvocationException {
        try {
            return method.invoke(target, args);
        } catch (IllegalAccessException e) {
            throw new MethodInvocationException("Cannot access method " + method.getName(), e);
        } catch (InvocationTargetException e) {
            throw new MethodInvocationException("Method " + method.getName() + " threw an exception", e.getTargetException());
        } catch (IllegalArgumentException e) {
            throw new MethodInvocationException("Invalid arguments for method " + method.getName(), e);
        }
    }
}
