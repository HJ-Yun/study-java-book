package chapter_11;

public class _31_StringSplitExample {
    public static void main(String[] args) {
        String text = "Mark, Andy,June&July,Jake-Janny";

        String[] names = text.split(", |,|&|-");

        for (String name : names){
            System.out.println(name);
        }
    }
}
