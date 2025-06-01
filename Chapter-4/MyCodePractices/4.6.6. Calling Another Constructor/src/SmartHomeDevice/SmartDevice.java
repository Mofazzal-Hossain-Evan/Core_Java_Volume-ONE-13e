package SmartHomeDevice;

public class SmartDevice {

    private  String name;
    private String type;

    public SmartDevice(String type, String name){
        this.name = name;
        this.type = type;
    }

    //Only type is provided, assigns a default name
    public SmartDevice(String type){
        this("Generic" + type, type);
    }

    public void display(){
        System.out.println("Device name: " + name + "Type :" +type);
    }
}
