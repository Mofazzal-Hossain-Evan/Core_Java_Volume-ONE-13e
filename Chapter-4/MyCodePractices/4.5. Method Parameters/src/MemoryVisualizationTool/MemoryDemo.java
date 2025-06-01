package MemoryVisualizationTool;

public class MemoryDemo {

    static void modifyPrimitive(int num){
        num = 99;
        System.out.println("Inside method (primitive): num = " + num);
    }

    static void modifyObject(StringBuilder sb){
        sb.append(" world ");
        System.out.println("Inside method (object): sb = "  + sb);
    }

    public static void main(String[] args) {
        int x = 43;
        System.out.println("Before method call (primitive): x = " + x);
        modifyPrimitive(x);
        System.out.println("After method call (primitive): x = "  + x);

        System.out.println("--------------------------");

        StringBuilder str = new StringBuilder("hello");
        System.out.println("Before method call (object): str = " + str);
        modifyObject(str);
        System.out.println("After method call (object): str = " + str);
    }
}
