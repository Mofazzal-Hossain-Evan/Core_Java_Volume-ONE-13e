package Dynamic_Class_Loader_and_Inspector;

public class BusinessOperationException extends ApplicationException {
    private static final long serialVersionUID = 1L;
    
    public BusinessOperationException(String message) {
        super(message);
    }
    
    public BusinessOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}
