package SealedTest;



sealed interface JSONPrimitive extends
        JSONValue permits JSONNumber, JSONString,JSONBoolean, JSONNull {
}

