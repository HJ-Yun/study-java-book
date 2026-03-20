package chapter_18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class _21_NonSerializableParentExample {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("C:/Temp/test.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        _21_Child child = new _21_Child();
        child.field1 = "Mark";
        child.field2 = "Nick";
        oos.writeObject(child);
        oos.flush(); oos.close(); fos.close();

        FileInputStream fis = new FileInputStream("C:/Temp/test.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        _21_Child v = (_21_Child) ois.readObject();
        System.out.println("field1 : " + v.field1);
        System.out.println("field2 : " + v.field2);
        ois.close(); fis.close();
    }
}
