package SealedTest;

final record JSONNumber(double value) implements JSONPrimitive
 {
    public String toString(){
        return "" + value;
    }
}
