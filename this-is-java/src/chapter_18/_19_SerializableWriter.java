package chapter_18;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class _19_SerializableWriter {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("C:/Temp/test.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        _19_ClassA classA = new _19_ClassA();
        classA.field1 = 1; //Serializable O
        classA.field2.filed1 = 2; //Serializable O
        classA.field3 = 3; //Serializable X
        classA.field4 = 4; //Serializable X
        oos.writeObject(classA);
        oos.flush(); oos.close(); fos.close();
    }
}
