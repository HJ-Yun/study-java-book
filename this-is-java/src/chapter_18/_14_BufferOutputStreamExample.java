package chapter_18;

import java.io.*;

public class _14_BufferOutputStreamExample {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        int data = -1;
        long start = 0;
        long end = 0;

        fis = new FileInputStream("C:/Temp/introBackground.jpg");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("C:/Temp/introBackground_copy1.jpg");
        start = System.currentTimeMillis();
        while ((data = bis.read()) != -1){
            fos.write(data);
        }
        fos.flush();
        end = System.currentTimeMillis();
        fos.close(); bis.close(); fis.close();
        System.out.println("No Buffer : " + (end - start));

        fis = new FileInputStream("C:/Temp/introBackground.jpg");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("C:/Temp/introBackground_copy2.jpg");
        bos = new BufferedOutputStream(fos);

        start = System.currentTimeMillis();
        while ((data = bis.read()) != -1){
            bos.write(data);
        }
        bos.flush();
        end = System.currentTimeMillis();
        bos.close(); fos.close(); bis.close(); fis.close();
        System.out.println("With Buffer : " + (end - start));
    }
}
