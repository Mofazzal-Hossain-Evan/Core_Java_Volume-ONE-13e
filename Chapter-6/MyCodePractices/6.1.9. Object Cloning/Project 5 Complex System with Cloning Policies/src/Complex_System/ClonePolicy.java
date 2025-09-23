package Complex_System;


// Cloning এর জন্য তিনটা পলিসি define করা হলো
enum ClonePolicy {
    SHALLOW,   // শুধু reference copy হবে
    DEEP,      // subobjects ক্লোন হবে
    NONE       // ক্লোনিং allow নয়
}

