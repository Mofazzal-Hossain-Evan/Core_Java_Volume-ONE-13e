package UniversityPeopleEquality;

public class Person {
    private String nationalId, name;

    public Person(String nationalId, String name) {
        this.nationalId = nationalId;
        this.name = name;
    }

    public String getNationalId() {
        return nationalId;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object otherObject){
        if (this == otherObject ) return true;
        if (!(otherObject instanceof Person other)) return false;
        return nationalId != null && nationalId.equals(other.nationalId);
    }

    @Override
    public int hashCode(){
        return nationalId == null ? 0 : nationalId.hashCode();
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + "[nationalId=" + nationalId + ", name=" + name + "]";

    }

}
