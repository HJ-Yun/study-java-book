package chapter_18;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class _20_SerialVersionUIDExample2 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("C:/Temp/test.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        _20_ClassC classC = (_20_ClassC) ois.readObject();
        System.out.println("field1 : " + classC.field1);
    }
}
