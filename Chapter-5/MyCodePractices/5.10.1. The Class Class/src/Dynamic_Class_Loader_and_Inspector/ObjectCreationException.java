package Dynamic_Class_Loader_and_Inspector;

public class ObjectCreationException extends ApplicationException {
    private static final long serialVersionUID = 1L;
    
    public ObjectCreationException(String message) {
        super(message);
    }
    
    public ObjectCreationException(String message, Throwable cause) {
        super(message, cause);
    }
}
