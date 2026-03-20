package chapter_18;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class _20_SerialVersionEIDExample1 {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("C:/Temp/test.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        _20_ClassC classC = new _20_ClassC();
        classC.field1 = 1;
        oos.writeObject(classC);
        oos.flush(); oos.close(); fos.close();
    }
}
