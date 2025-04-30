package SealedTest;

import java.util.*;

import java.util.ArrayList;

sealed interface JSONValue permits JSONArray, JSONObject, JSONPrimitive {
    public default String type(){

        if (this instanceof JSONArray ) return "Array";
        else if(this instanceof JSONObject) return "Object";
        else if (this instanceof JSONNumber) return "number";
        else if(this instanceof JSONString) return "string";
        else if(this instanceof  JSONBoolean) return "boolean";
        else return "null";
    }
}

