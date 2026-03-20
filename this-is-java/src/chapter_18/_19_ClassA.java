package chapter_18;

import java.io.Serializable;

public class _19_ClassA implements Serializable {
    int field1; //Serializable O
    _19_ClassB field2 = new _19_ClassB(); //Serializable O
    static int field3; //Serializable X
    transient int field4; //Serializable X

}
