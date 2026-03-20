package chapter_18;

import java.io.OutputStream;

public class _02_SystemOutExample {
    public static void main(String[] args) throws Exception{
        OutputStream os = System.out;

        for (byte b = 48; b <58; b++){
            os.write(b);
        }
        os.write(10);

        for (byte b= 97; b < 123; b++){
            os.write(b);
        }
        os.write(10);

        String str = "こんにちは";
        byte[] strArr = str.getBytes();
        os.write(strArr);

        os.flush();
    }
}
