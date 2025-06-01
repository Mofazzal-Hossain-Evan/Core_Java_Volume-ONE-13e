package Dynamic_Object_Instantiator;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class DynamicObjectInstantiator {
    /**
     * ডায়নামিকভাবে একটি ক্লাসের ইনস্ট্যান্স তৈরি করে ক্লাসের নাম এবং আর্গুমেন্ট ব্যবহার করে।
     * @param className সম্পূর্ণ ক্লাসের নাম
     * @param args কনস্ট্রাক্টরের আর্গুমেন্ট
     * @return ক্লাসের ইনস্ট্যান্স
     * @throws Exception যদি ইনস্ট্যান্স তৈরি ব্যর্থ হয়
     */
    public static Object createInstance(String className, Object... args) throws Exception {
        try {
            // ক্লাস লোড করা
            Class<?> clazz = Class.forName(className);

            // আর্গুমেন্ট থেকে প্যারামিটার টাইপ পাওয়া
            Class<?>[] paramTypes = Arrays.stream(args)
                    .map(Object::getClass)
                    .toArray(Class[]::new);

            // প্রিমিটিভ টাইপ হ্যান্ডেল করা (যেমন, Integer -> int)
            paramTypes = convertWrapperToPrimitive(paramTypes);

            // ম্যাচিং কনস্ট্রাক্টর খুঁজে পাওয়া
            Constructor<?> constructor = findMatchingConstructor(clazz, paramTypes);

            // নতুন ইনস্ট্যান্স তৈরি
            return constructor.newInstance(args);

        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("ক্লাস পাওয়া যায়নি: " + className, e);
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("ম্যাচিং কনস্ট্রাক্টর পাওয়া যায়নি: " + className, e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException("কনস্ট্রাক্টর একটি এক্সেপশন থ্রো করেছে", e.getCause());
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("কনস্ট্রাক্টর অ্যাক্সেসযোগ্য নয়", e);
        } catch (InstantiationException e) {
            throw new IllegalArgumentException("ক্লাস ইনস্ট্যান্সিয়েট করা যায় না", e);
        }
    }

    /**
     * স্পষ্টভাবে নির্দিষ্ট প্যারামিটার টাইপ সহ ইনস্ট্যান্স তৈরি করে।
     * @param className সম্পূর্ণ ক্লাসের নাম
     * @param paramTypes প্যারামিটার টাইপের নামের অ্যারে
     * @param args কনস্ট্রাক্টরের আর্গুমেন্ট
     * @return ক্লাসের ইনস্ট্যান্স
     * @throws Exception যদি ইনস্ট্যান্স তৈরি ব্যর্থ হয়
     */
    public static Object createInstanceWithTypes(String className, String[] paramTypes, Object... args) throws Exception {
        try {
            // ক্লাস লোড করা
            Class<?> clazz = Class.forName(className);

            // টাইপ নামগুলো ক্লাস অবজেক্টে রূপান্তর
            Class<?>[] paramClasses = Arrays.stream(paramTypes)
                    .map(typeName -> {
                        try {
                            return Class.forName(typeName);
                        } catch (ClassNotFoundException e) {
                            // প্রিমিটিভ টাইপ হ্যান্ডেল করা
                            return getPrimitiveClass(typeName);
                        }
                    })
                    .toArray(Class[]::new);

            // ম্যাচিং কনস্ট্রাক্টর খুঁজে পাওয়া
            Constructor<?> constructor = findMatchingConstructor(clazz, paramClasses);

            // নতুন ইনস্ট্যান্স তৈরি
            return constructor.newInstance(args);

        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("ক্লাস পাওয়া যায়নি: " + className, e);
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("ম্যাচিং কনস্ট্রাক্টর পাওয়া যায়নি: " + className, e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException("কনস্ট্রাক্টর একটি এক্সেপশন থ্রো করেছে", e.getCause());
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("কনস্ট্রাক্টর অ্যাক্সেসযোগ্য নয়", e);
        } catch (InstantiationException e) {
            throw new IllegalArgumentException("ক্লাস ইনস্ট্যান্সিয়েট করা যায় না", e);
        }
    }

/**
 * প্রিমিটিভ টাইপের জন্য র‍্যাপার ক্লাসকে রূপান্তর করে।
 * @param paramTypes প্যারামিটার টাইপের অ্যারে
 * @return রূপান্তরিত টাইপের অ্যারে
 */

private static Class<?>[] convertWrapperToPrimitive(Class<?>[] paramTypes ){
Class<?>[] result = new Class<?>[paramTypes.length];
    for (int i = 0; i < paramTypes.length; i++) {
        if (paramTypes[i] == Integer.class) result[i] = int.class;
        else if (paramTypes[i] == Long.class) result[i] = long.class;
        else if (paramTypes[i] == Double.class) result[i] = double.class;
        else if (paramTypes[i] == Float.class) result[i] = float.class;
        else if (paramTypes[i] == Boolean.class) result[i] = boolean.class;
        else if (paramTypes[i] == Byte.class) result[i] = byte.class;
        else if (paramTypes[i] == Short.class) result[i] = short.class;
        else if (paramTypes[i] == Character.class) result[i] = char.class;
        else result[i] = paramTypes[i];
    }
    return result;
}

    /**
     * প্রিমিটিভ ক্লাসের নাম থেকে ক্লাস অবজেক্ট পায়।
     * @param typeName টাইপের নাম
     * @return ক্লাস অবজেক্ট
     */
    private static Class<?> getPrimitiveClass(String typeName) {
        switch (typeName) {
            case "int": return int.class;
            case "long": return long.class;
            case "double": return double.class;
            case "float": return float.class;
            case "boolean": return boolean.class;
            case "byte": return byte.class;
            case "short": return short.class;
            case "char": return char.class;
            default: throw new IllegalArgumentException("অজানা টাইপ: " + typeName);
        }
    }

    /**
     * ম্যাচিং কনস্ট্রাক্টর খুঁজে পায়।
     * @param clazz ক্লাস
     * @param paramTypes প্যারামিটার টাইপ
     * @return ম্যাচিং কনস্ট্রাক্টর
     * @throws NoSuchMethodException যদি কনস্ট্রাক্টর না পাওয়া যায়
     */
    private static Constructor<?> findMatchingConstructor(Class<?> clazz, Class<?>[] paramTypes) throws NoSuchMethodException {
        try {
            return clazz.getConstructor(paramTypes);
        } catch (NoSuchMethodException e) {
            // আরও নমনীয় ম্যাচিং এর জন্য কনস্ট্রাক্টর পরীক্ষা
            for (Constructor<?> constructor : clazz.getConstructors()) {
                Class<?>[] constructorParams = constructor.getParameterTypes();
                if (constructorParams.length == paramTypes.length && isAssignable(paramTypes, constructorParams)) {
                    return constructor;
                }
            }
            throw e;
        }
    }

    /**
     * প্যারামিটার টাইপ অ্যাসাইনযোগ্য কিনা তা পরীক্ষা করে।
     * @param paramTypes প্রদত্ত প্যারামিটার টাইপ
     * @param constructorParams কনস্ট্রাক্টরের প্যারামিটার টাইপ
     * @return true যদি অ্যাসাইনযোগ্য হয়
     */
    private static boolean isAssignable(Class<?>[] paramTypes, Class<?>[] constructorParams) {
        for (int i = 0; i < paramTypes.length; i++) {
            if (!constructorParams[i].isAssignableFrom(paramTypes[i])) {
                return false;
            }
        }
        return true;
    }

    // উদাহরণ ব্যবহার
    public static void main(String[] args) {
        try {
            // java.util.Date ক্লাসের ইনস্ট্যান্স তৈরি
            Object dateInstance = createInstance("java.util.Date", 1234567890000L);
            System.out.println("তৈরি করা ইনস্ট্যান্স: " + dateInstance);

            // স্পষ্ট টাইপ সহ ইনস্ট্যান্স তৈরি
            Object dateInstanceWithTypes = createInstanceWithTypes(
                    "java.util.Date",
                    new String[]{"long"},
                    1234567890000L
            );
            System.out.println("স্পষ্ট টাইপ সহ ইনস্ট্যান্স: " + dateInstanceWithTypes);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}