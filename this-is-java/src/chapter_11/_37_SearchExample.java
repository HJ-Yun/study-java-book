package chapter_11;

import chapter_09._07_Person;

import java.util.Arrays;

public class _37_SearchExample {
    public static void main(String[] args) {
        int[] score = {99, 97, 93, 95, 40};
        Arrays.sort(score); //40, 93, 95, 97, 99
        int index = Arrays.binarySearch(score,95);
        System.out.println("Find score : " + index);

        String[] name = {"Mark", "Anny", "John"};
        Arrays.sort(name);
        index = Arrays.binarySearch(name,"John");
        System.out.println("Find name : " + index);
    }
}
