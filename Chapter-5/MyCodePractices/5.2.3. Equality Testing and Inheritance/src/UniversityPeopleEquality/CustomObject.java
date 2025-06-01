package UniversityPeopleEquality;

public class CustomObject {
    private int id;

    public CustomObject(int id) {
        this.id = id;
    }

    public boolean isEqualTo(CustomObject other){
        if (other ==  null) return false;
        return this.id == other.id;
    }

    public int customHashCode(){
        int prime = 32;
        int result = 1;
        result = prime * result + id;
        return result;
    }
    @Override
    public  String toString(){
        return "CustomObject[id=" + id + "]";
    }
}
