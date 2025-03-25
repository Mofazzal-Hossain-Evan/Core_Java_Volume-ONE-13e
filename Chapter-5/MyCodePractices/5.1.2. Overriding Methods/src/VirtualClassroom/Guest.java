package VirtualClassroom;

public class Guest extends User {

   Guest(String name) {
        super(name);
    }

    @Override
    void joinClass(){
        super.joinClass();
        System.out.println(name + " is in read-only mode.");
    }



    void interact(){
        System.out.println(name + " is observing the class.");
    }
}
