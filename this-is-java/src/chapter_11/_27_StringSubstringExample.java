package chapter_11;

public class _27_StringSubstringExample {
    public static void main(String[] args) {
        String ssn = "1234567-1234585";

        String firstNum = ssn.substring(0,6);
        System.out.println(firstNum);

        String lastNum = ssn.substring(7);
        System.out.println(lastNum);
    }
}
