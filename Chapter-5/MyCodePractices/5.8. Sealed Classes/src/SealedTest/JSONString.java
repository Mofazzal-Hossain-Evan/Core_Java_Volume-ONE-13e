package SealedTest;

final record JSONString(String value) implements JSONPrimitive {
    public String toString(){
        return "\"" + value.translateEscapes() +  "\"";
    }
}
