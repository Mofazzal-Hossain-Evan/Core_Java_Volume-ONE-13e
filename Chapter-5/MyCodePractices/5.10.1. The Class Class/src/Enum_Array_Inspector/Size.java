package Enum_Array_Inspector;

public enum Size {
    SMALL{
    public String toString(){
        return "🔹 Tiny size";
    }
},
    MEDIUM,
    LARGE;

    public void describe(){
        System.out.println("Default size: " + name());
    }
}

