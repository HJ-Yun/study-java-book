package chapter_18;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class _21_Child extends _21_Parent implements Serializable {
    public String field2;

    private void writeObject(ObjectOutputStream out) throws IOException{
        out.writeUTF(field1); //Write Parent instance
        out.defaultWriteObject(); //Write Child instance
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
        field1 = in.readUTF(); //Read Parent instance
        in.defaultReadObject(); //Read Child instance
    }

}
