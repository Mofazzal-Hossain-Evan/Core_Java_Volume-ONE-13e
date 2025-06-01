package Dynamic_Class_Loader_and_Inspector;

public class MethodInvocationException extends ApplicationException {
    private static final long serialVersionUID = 1L;
    
    public MethodInvocationException(String message) {
        super(message);
    }
    
    public MethodInvocationException(String message, Throwable cause) {
        super(message, cause);
    }
}
