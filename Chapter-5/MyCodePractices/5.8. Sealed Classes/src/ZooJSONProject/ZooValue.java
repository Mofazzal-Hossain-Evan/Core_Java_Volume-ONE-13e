package ZooJSONProject;

sealed interface ZooValue permits ZooObject, ZooArray, ZooAnimal {

    default String sound() {
        return switch (this) {
            case ZooArray __ -> "Group of animals making noise!";
            case ZooObject __ -> "Zoo map sounds!";
            case ZooLion __ -> "Roar!";
            case ZooTiger __ -> "Grrr!";
            case ZooParrot __ -> "Squawk squawk!";
            case ZooElephant __ -> "Pawoo!";
            case ZooSnake __ -> "Hiss hiss!";
            case ZooVoid __ -> "Zzz... no animal here.";
        };
    }
}