package chapter_18;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class _07_FileOutputStreamExample {
    public static void main(String[] args) throws Exception{
        String original = "C:/Temp/picture.png";
        String target = "C:/Temp/copy.png";

        FileInputStream fis = new FileInputStream(original);
        FileOutputStream fos = new FileOutputStream(target);

        int readByNo;
        byte[] readBytes = new byte[100];
        while ((readByNo = fis.read(readBytes)) != -1){
            fos.write(readBytes,0,readByNo);
        }

        fos.flush();
        fos.close();
        fis.close();

        System.out.println("Copy Finished");
    }
}
