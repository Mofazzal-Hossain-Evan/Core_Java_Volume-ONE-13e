package Dynamic_Class_Loader_and_Inspector;

public class CheckedBusinessException extends ApplicationException {
    private static final long serialVersionUID = 1L;
    
    public CheckedBusinessException(String message) {
        super(message);
    }
    
    public CheckedBusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}
