package PetShopSystem;

public class PetShopSystem {
    public static void main(String[] args) {

        PetStore store = new PetStore();
        Pet[] pets = store.getPets();
        System.out.println("Pet Store" + pets.length);
        //1

        Trainable t1 = new Cat();
        Trainable t2 = new Dog();
        Trainable t3 = new Tiger();

        t1.train("up");
        t1.feed("food");
        t2.train("up");
        t2.feed("food");
//2
        for (Pet p : pets){
            if (p instanceof Cat){
                System.out.println();
            }
            if(p instanceof Dog){
                System.out.println();
            }
            if (p instanceof Tiger){
                System.out.println();
            }
        }
        //3
        Trainable pet1 = new Dog();
        Trainable pet2 = new Cat();
        pet2.train("goo");
        pet1.train("goo");
        //4
        int safeMinute = 40;
        int dangerMinute = 90;

        if (safeMinute > Cuddlable.MAX_CUDDLE ){
            System.out.println();
        } else {
            System.out.println();
        }
        if (dangerMinute > Cuddlable.MAX_CUDDLE){
            System.out.println();
        } else  {
            System.out.println();
        }

        //5
    }
}
