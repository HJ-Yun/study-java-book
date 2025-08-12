package chapter_16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class _08_FromFileContentExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/JavaWorkspace/This is Java_Book/src/chapter_15/_10_database.properties");
        Stream<String> stream;

        //Files.lines()
        stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(System.out::println);
        System.out.println();

        //BufferedReader.lines()
        File file = path.toFile();
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        stream = br.lines();
        stream.forEach(System.out::println);
    }
}
