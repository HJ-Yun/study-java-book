package chapter_18;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class _11_OutputStreamWriteExample {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("C:/Temp/file.txt");
        Writer writer = new OutputStreamWriter(fos);

        String data = "Write this String";
        writer.write(data);

        writer.flush();
        writer.close();
        System.out.println("Save finished");

    }
}
