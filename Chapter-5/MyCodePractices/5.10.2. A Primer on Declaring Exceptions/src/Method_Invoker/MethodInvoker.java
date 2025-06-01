package Method_Invoker;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MethodInvoker {
    /**
     * রিফ্লেকশন ব্যবহার করে ডায়নামিকভাবে মেথড কল করে।
     * @param className   ক্লাসের পূর্ণ নাম (যেমন, "java.lang.Math")
     * @param methodName  কল করতে চাওয়া মেথডের নাম
     * @param instance    ক্লাসের ইনস্ট্যান্স (স্ট্যাটিক মেথডের জন্য null)
     * @param args        মেথডে পাঠানো আর্গুমেন্ট
     * @return            মেথডের ফলাফল
     * @throws Exception  যদি কোনো রিফ্লেকশন সম্পর্কিত ত্রুটি হয়
     */
public static Object invokeMethod(String className, String methodName, Object instance, Object... args)throws
        Exception{
// ধাপ ১: ক্লাসটি ডায়নামিকভাবে লোড করা
Class<?> clazz = Class.forName(className);

// ধাপ ২: মেথডের প্যারামিটার টাইপ বের করা
    Class<?>[]  parameterTypes = new Class<?>[args.length];
    for (int i =0; i < args.length; i++){
        parameterTypes[i] = args[i].getClass();
        // প্রিমিটিভ টাইপ হ্যান্ডল করা (যেমন, Double -> double)
        if (parameterTypes[i] == Integer.class) parameterTypes[i] = int.class;
        else if (parameterTypes[i] == Double.class) parameterTypes[i] = double.class;
        else if (parameterTypes[i] == Boolean.class) parameterTypes[i] = boolean.class;
    }
    // ধাপ ৩: মেথড খুঁজে বের করা
    Method method;
    try {method = clazz.getMethod(methodName, parameterTypes); // পাবলিক মেথড খোঁজা
    } catch (NoSuchMethodException e){
        // প্রাইভেট মেথড খোঁজা
        method = clazz.getDeclaredMethod(methodName, parameterTypes);
        method.setAccessible(true); // প্রাইভেট মেথডে অ্যাক্সেস দেওয়া
    }
    // ধাপ ৪: নন-স্ট্যাটিক মেথডের জন্য ইনস্ট্যান্স তৈরি করা
    if (instance == null && !java.lang.reflect.Modifier.isStatic(method.getModifiers())) {
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        instance = constructor.newInstance();
    }
    // ধাপ ৫: মেথড কল করা
    return method.invoke(instance, args);
}

    // উদাহরণ ব্যবহার
    public static void main(String[] args) {
        try {
            // উদাহরণ ১: স্ট্যাটিক মেথড কল (Math.sqrt)
            Object result1 = invokeMethod("java.lang.Math", "sqrt", null, 16.0);
            System.out.println("Math.sqrt(16.0) = " + result1);

            // উদাহরণ ২: ইনস্ট্যান্স মেথড কল (String.toUpperCase)
            String str = "hello";
            Object result2 = invokeMethod("java.lang.String", "toUpperCase", str);
            System.out.println("String.toUpperCase(\"hello\") = " + result2);

            // উদাহরণ ৩: প্রাইভেট মেথড কল (একটি কাস্টম ক্লাস দরকার)
            // এখানে সিম্পলি দেখানো হলো না, কিন্তু কোড সাপোর্ট করে
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

//https://grok.com/share/c2hhcmQtMg%3D%3D_2284fe77-b967-4dad-8f1f-a6aaba7efa75
