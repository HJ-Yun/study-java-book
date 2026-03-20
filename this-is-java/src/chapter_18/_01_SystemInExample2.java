package chapter_18;

import java.io.InputStream;

public class _01_SystemInExample2 {
    public static void main(String[] args) throws Exception{
        InputStream is = System.in;
        byte[] datas = new byte[100];

        System.out.print("Name : ");
        int nameByte = is.read(datas);
        String name = new String(datas,0,nameByte-1);

        System.out.print("Comment : ");
        int commentByte = is.read(datas);
        String comment = new String(datas,0,commentByte-1);

        System.out.println("Name : " + name);
        System.out.println("Comment : " + comment);
    }
}
