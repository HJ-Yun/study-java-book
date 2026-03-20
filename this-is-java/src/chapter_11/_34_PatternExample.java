package chapter_11;

import java.util.regex.Pattern;

public class _34_PatternExample {
    public static void main(String[] args) {
        String regExp = "(011|010)-\\d{3,4}-\\d{4}";
        String data = "011-123-4556";

        boolean result = Pattern.matches(regExp,data);
        if (result){
            System.out.println(result);
        } else {
            System.out.println("Not match with pattern");
        }

        regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        data = "angel@gmailcom";
        result = Pattern.matches(regExp,data);

        if (result){
            System.out.println(result);
        } else {
            System.out.println("Not match with pattern");
        }
    }
}
