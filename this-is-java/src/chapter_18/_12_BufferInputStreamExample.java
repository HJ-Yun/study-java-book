package chapter_18;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class _12_BufferInputStreamExample {
    public static void main(String[] args) throws Exception{
        long start = 0;
        long end = 0;


        FileInputStream fis1 = new FileInputStream("C:/Temp/picture.png");
        start = System.currentTimeMillis();
        while (fis1.read() != -1){}
        end = System.currentTimeMillis();
        System.out.println("No Buffer : " + (end - start));
        fis1.close();

        FileInputStream fis2 = new FileInputStream("C:/Temp/picture.png");
        BufferedInputStream bis = new BufferedInputStream(fis2);
        start = System.currentTimeMillis();
        while (bis.read() != -1){}
        end = System.currentTimeMillis();
        System.out.println("With Buffer : " + (end - start));
        bis.close();
        fis2.close();
    }
}
