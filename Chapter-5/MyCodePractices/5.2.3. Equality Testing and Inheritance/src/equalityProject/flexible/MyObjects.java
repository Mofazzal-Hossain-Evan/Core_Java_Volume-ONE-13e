package equalityProject.flexible;

public class MyObjects {
    public static boolean equals(Object a, Object b){
        return (a==b) || (a != null && a.equals(b));
    }
}
