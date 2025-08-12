package chapter_11;

public class _24_StringIndexOfExample {
    public static void main(String[] args) {
        String bookName = "Java Program";

        int location = bookName.indexOf("Program");
        System.out.println(location);

        if (location == -1){
            System.out.println("This is not related with Java.");
        } else {
            System.out.println("This is related with Java.");
        }
    }
}
