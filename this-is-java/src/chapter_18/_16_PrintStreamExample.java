package chapter_18;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class _16_PrintStreamExample {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("C:/Temp/Text.txt");
        PrintStream ps = new PrintStream(fos);

        ps.println("Print Stream");

        ps.flush();
        ps.close();
        fos.close();
    }
}
