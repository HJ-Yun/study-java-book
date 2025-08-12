package chapter_11;

import java.text.MessageFormat;

public class _50_MessageFormatExample {
    public static void main(String[] args) {
        String id = "java";
        String name = "Mark";
        String tell = "011-0124-0153";

        String text = "ID : {0} \nName : {1} \nTell : {2}";
        String result1 = MessageFormat.format(text, id, name, tell);
        System.out.println(result1);

        String sql = "inter in to member value ({0}, {1}, {2})";
        Object[] arguments = {"java", "Mark", "011-1230-1234"};
        String result2 = MessageFormat.format(sql,arguments);
        System.out.println(result2);
    }
}
