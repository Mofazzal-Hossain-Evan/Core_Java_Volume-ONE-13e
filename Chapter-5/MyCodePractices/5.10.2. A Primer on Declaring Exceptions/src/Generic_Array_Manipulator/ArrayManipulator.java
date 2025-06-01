package Generic_Array_Manipulator;

import java.lang.reflect.Array;

public class ArrayManipulator {
    // অ্যারে তৈরি করা

    public static Object createArray(Class<?> componentType, int size){
        if (componentType == null || size < 0){
            throw  new IllegalArgumentException("অবৈধ কম্পোনেন্ট টাইপ বা সাইজ");
        }
        // Array.newInstance ব্যবহার করে অ্যারে তৈরি
        return Array.newInstance(componentType, size);
    }
    // অ্যারের এলিমেন্ট সেট করা
    public static void setArrayElement (Object array, int index, Object value){
        try {
            Array.set(array, index, value);
        } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e){
            throw new IllegalArgumentException("ত্রুটি: অবৈধ ইনডেক্স বা মান: " + e.getClass() + e.getMessage());
        }
    }
// অ্যারের এলিমেন্ট পড়া
    public static Object getArrayElement(Object array, int index){
        try{
            return Array.get(array, index);
        } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("ত্রুটি: অবৈধ ইনডেক্স: " + e.getMessage());
        }
    }
    // অ্যারে প্রিন্ট করা
    public static String arrayToString(Object array){
        if (array == null) {
            return "null";
        }
        int length = Array.getLength(array);
        StringBuilder result  = new StringBuilder("[");
        for (int i = 0; i < length; i++){
            Object element = Array.get(array, i);
            result.append(element == null ? "Null" : element.toString());
            if (i < length -1){
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();

    }
// অ্যারে রিসাইজ করা
    public static Object resizeArray(Object array, int newSize){
        if (array ==  null || newSize < 0){
            throw new IllegalArgumentException("অবৈধ অ্যারে বা নতুন সাইজ");
        }

        int currentLength = Array.getLength(array);
        Class<?> componentType = array.getClass().getComponentType();
        // নতুন অ্যারে তৈরি
        Object newArray = Array.newInstance(componentType, newSize);
        // বিদ্যমান এলিমেন্ট কপি করা
        int copyLength = Math.min(currentLength, newSize);
        for (int i =0; i < copyLength; i++){
            Array.set(newArray, i, Array.get(array, i));
        }
        return newArray;
    }

    // টেস্ট করার জন্য মেইন মেথড
    public static void main(String[] args) {
        try{
            // String অ্যারে টেস্ট
            Class<?> type = String.class;
            int size = 3;
            Object array = createArray(type, size);
            setArrayElement(array, 0, "something");
            setArrayElement(array, 0, "something2");
            System.out.println("String অ্যারে: " + arrayToString(array));

            // অ্যারে রিসাইজ
            Object resizedArray = resizeArray(array, 5);
            System.out.println("রিসাইজ করা String অ্যারে: " + arrayToString(resizedArray));

            // int অ্যারে টেস্ট
            type = int.class;
            size = 4;
            array = createArray(type, size);
            setArrayElement(array, 0, 21);
            System.out.println("int অ্যারে: " + arrayToString(array));
        } catch (Exception e){
            System.out.println("ত্রুটি: "+ e.getMessage());
            e.printStackTrace();
        }
    }


}
