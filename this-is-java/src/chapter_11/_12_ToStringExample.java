package chapter_11;

import java.util.Objects;

public class _12_ToStringExample {
    public static void main(String[] args) {
        String str1 = "Mark";
        String str2 = null;

        System.out.println(Objects.toString(str1));
        System.out.println(Objects.toString(str2));
        System.out.println(Objects.toString(str2, "There is no name"));
    }
}
