package Plugin_Loader;

public class Tool {
    private String name;
    private int power;

    public Tool(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String toString(){
        return "🛠️ Tool[name=" + name + ", power=" + power + "]";
    }
}
