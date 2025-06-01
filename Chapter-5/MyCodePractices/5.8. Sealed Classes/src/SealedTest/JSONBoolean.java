package SealedTest;

 enum JSONBoolean implements JSONPrimitive {
     FALSE, TRUE;
     public String toString(){
         return super.toString().toLowerCase();
     }
}
