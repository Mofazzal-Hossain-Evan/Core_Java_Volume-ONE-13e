package VirtualClassroom;

abstract class User { // ✅ সঠিক সংশোধন


    String name;

    public User(String name) {
        this.name = name;
    }

    void joinClass(){
        System.out.println( name + "Has joined.");
    }

    abstract void interact();

}

