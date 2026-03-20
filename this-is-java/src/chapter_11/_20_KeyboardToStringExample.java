package chapter_11;

import java.io.IOException;
import java.util.Arrays;

public class _20_KeyboardToStringExample {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[100];

        System.out.print("Input : ");
        int readByteNo = System.in.read(bytes);

        String str = new String(bytes,0,readByteNo-1);
        System.out.println(str);
    }
}
