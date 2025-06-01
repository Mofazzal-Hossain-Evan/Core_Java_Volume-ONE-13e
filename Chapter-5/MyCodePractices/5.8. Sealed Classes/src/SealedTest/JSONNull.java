package SealedTest;

 enum JSONNull implements JSONPrimitive {
     INSTANCE;

     @Override
     public String toString() {
         return "null";
     }
 }
