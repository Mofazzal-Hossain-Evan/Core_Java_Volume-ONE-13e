package Dynamic_Library;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class LoggingProxy  implements InvocationHandler {
    private LoanOperations target;
    private List<String> logs;

    public LoggingProxy(LoanOperations target) {
        this.target = target;
        this.logs = new ArrayList<>();
    }

    public List<String> getLogs(){
        return logs;
    }

    @Override
    public Object invoke(Object proxy, Method method , Object[] args) throws Throwable{
        String logMessage = "Method " + method.getName() +" called at " +

                LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                logs.add(logMessage);
                return method.invoke(target, args);
    }
}
