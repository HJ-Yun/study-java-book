package chapter_11;

import java.util.Date;

public class _03_ToStringExample {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Date obj3 = new Date();

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());
    }
}
