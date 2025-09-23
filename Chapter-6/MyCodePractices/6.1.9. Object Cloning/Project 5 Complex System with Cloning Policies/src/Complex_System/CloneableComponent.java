package Complex_System;

 interface CloneableComponent extends Cloneable{
    CloneableComponent cloneComponent(ClonePolicy policy) throws  CloneNotSupportedException;
}
