package core;

import java.lang.reflect.Method;

public class Calculator {
    private double result;

    // ব্যাখ্যা: executeOperation রিফ্লেকশন ব্যবহার করে গণনা কল করে।
    public void executeOperation(String operationName, Object... args) throws ReflectiveOperationException {
        Method method = Math.class.getMethod(operationName, getParameterTypes(args));
        Object resultObj = method.invoke(null, args);
        this.result = (Double) resultObj; // Double থেকে double-এ রূপান্তর
    }

    // ব্যা�kh্যা: displayResult ফলাফল প্রদর্শন করে।
    public void displayResult() {
        System.out.println("Result: " + result);
    }

    // ব্যাখ্যা: getParameterTypes আর্গুমেন্টের টাইপ নির্ধারণ করে।
    private Class<?>[] getParameterTypes(Object... args) {
        Class<?>[] types = new Class<?>[args.length];
        for (int i = 0; i < args.length; i++) {
            types[i] = args[i].getClass();
        }
        return types;
    }
}