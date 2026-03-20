package chapter_18;

import java.io.FileInputStream;

public class _06_FileInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(
                    "C:/JavaWorkspace/This is Java_Book/src/chapter_18/_06_FileInputStreamExample.java"
            );

            int data;
            while ((data = fis.read()) != -1){
                System.out.write(data);
            }
            fis.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
