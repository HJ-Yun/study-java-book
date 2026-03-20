package chapter_18;

import java.io.FileReader;

public class _08_FileReaderExample {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader(
                "C:/JavaWorkspace/This is Java_Book/src/chapter_18/_08_FileReaderExample.java"
        );

        int readCharNo;
        char[] cbuf = new char[100];
        while ((readCharNo = fr.read(cbuf)) != -1){
            String data = new String(cbuf,0,readCharNo);
            System.out.print(data);
        }
        fr.close();
    }
}
