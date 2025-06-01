package Dynamic_Class_Loader_and_Inspector;

public class UncheckedBusinessException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    
    public UncheckedBusinessException(String message) {
        super(message);
    }
    
    public UncheckedBusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}
