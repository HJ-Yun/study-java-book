package chapter_11;

public class _26_StringReplaceExample {
    public static void main(String[] args) {
        String oldStr = "Java is good";
        String newStr = oldStr.replace("good","best");

        System.out.println(oldStr);
        System.out.println(newStr);
    }
}
