package chapter_18;

import java.io.File;
import java.io.FileWriter;

public class _09_FileWriteExample {
    public static void main(String[] args) throws Exception{
        File file = new File("C:/Temp/file1.txt");
        FileWriter fw = new FileWriter(file,true);

        fw.write("\nFile Write1\n");
        fw.write("File write2\n");
        fw.flush();
        fw.close();
        System.out.println("File saved");

        //Before : file1

        //After : file1
        //        File Write1
        //        File write2
    }
}
