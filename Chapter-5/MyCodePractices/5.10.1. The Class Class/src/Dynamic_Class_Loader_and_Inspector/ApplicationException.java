package Dynamic_Class_Loader_and_Inspector;

public class ApplicationException extends Exception {
    private static final long serialVersionUID = 1L;
    
    public ApplicationException(String message) {
        super(message);
    }
    
    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }
}
