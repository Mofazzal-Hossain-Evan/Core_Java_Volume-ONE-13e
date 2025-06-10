package core;

import java.lang.reflect.Method;

public class Plugin {

    public void execute(String methodName, Object...args) throws ReflectiveOperationException{
        Method method = this.getClass().getMethod(methodName, getParameterType(args));
        method.invoke(this, args);
    }

    public String getDescription(){
        return "Generic Plugin";
    }

    // ব্যাখ্যা: getParameterTypes আর্গুমেন্টের টাইপ নির্ধারণ করে।
    private Class<?> [] getParameterType(Object... args){
        Class<?>[] types = new Class<?>[args.length];
        for (int i = 0; i<args.length; i++){
            types[i] = args[i].getClass();
        }
        return types;
    }
}
