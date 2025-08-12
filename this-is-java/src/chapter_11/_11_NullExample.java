package chapter_11;

import java.util.Objects;

public class _11_NullExample {
    public static void main(String[] args) {
        String str1 = "Mark";
        String str2 = null;

        System.out.println(Objects.requireNonNull(str1));

        try {
            String name = Objects.requireNonNull(str2);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            String name = Objects.requireNonNull(str2, "There is no name");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            String name = Objects.requireNonNull(str2, ()->"There is no name, sir.");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
