package chapter_18;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _05_FileExample {
    public static void main(String[] args) throws Exception{
        File dir = new File("C:/Temp/Dir");
        File file1 = new File("C:/Temp/file1.txt");
        File file2 = new File("C:/Temp/file2.txt");

        if (dir.exists() == false){
            dir.mkdirs();
        }
        if (file1.exists() == false){
            file1.createNewFile();
        }
        if (file2.exists() == false){
            file2.createNewFile();
        }

        File temp = new File("C:/Temp");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  a    HH:mm");
        File[] contents = temp.listFiles();

        System.out.println("Date\t\tTime\tFrom\tSize\tName");
        System.out.println("------------------------------------------------");

        for (File file : contents){
            System.out.print(sdf.format(new Date(file.lastModified())));
            if (file.isDirectory()){
                System.out.print("\t<DIR>\t" + file.getName());
            } else {
                System.out.print("\t" + file.length() + "\t\t" + file.getName());
            }
            System.out.println();
        }
    }
}
