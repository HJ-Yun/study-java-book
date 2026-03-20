package chapter_11;

public class _28_StringToLowerUpperCaseExample {
    public static void main(String[] args) {
        String str1 = "Java Program";
        String str2 = "JAVA program";
        System.out.println(str1.equals(str2));

        String lower1 = str1.toLowerCase();
        String lower2 = str2.toLowerCase();
        System.out.println(lower1.equals(lower2));

        System.out.println(lower1.equalsIgnoreCase(str2));

    }
}
