package Dynamic_Class_Loader_and_Inspector;

public class ClassLoadingException extends ApplicationException {
    private static final long serialVersionUID = 1L;
    
    public ClassLoadingException(String message) {
        super(message);
    }
    
    public ClassLoadingException(String message, Throwable cause) {
        super(message, cause);
    }
}
