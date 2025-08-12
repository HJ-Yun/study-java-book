package chapter_11;

import chapter_09._07_Person;

public class _18_ClassExample {
    public static void main(String[] args) {
        _07_Person myPerson = new _07_Person();
        Class clazz1 = myPerson.getClass();
        System.out.println(clazz1.getName());
        System.out.println(clazz1.getSimpleName());
        System.out.println(clazz1.getPackage().getName());
        System.out.println();
    }
}
