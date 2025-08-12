package chapter_18;

import java.io.*;

public class _13_BufferReaderExample {
    public static void main(String[] args) throws Exception{
        InputStream is = System.in;
        Reader reader = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(reader);

        System.out.print("Input : ");
        String line = br.readLine();

        System.out.print("Output : " + line);
    }
}
