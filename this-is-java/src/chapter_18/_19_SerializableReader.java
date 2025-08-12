package chapter_18;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class _19_SerializableReader {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("C:/Temp/test.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        _19_ClassA v = (_19_ClassA) ois.readObject();

        System.out.println("field1 : " + v.field1); //Serializable O
        System.out.println("field2.field1 : " + v.field2.filed1); //Serializable O
        System.out.println("field3 : " + v.field3); //Serializable X
        System.out.println("field4 : " + v.field4); //Serializable X
    }
}
