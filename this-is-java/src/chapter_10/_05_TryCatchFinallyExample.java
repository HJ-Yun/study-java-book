package chapter_10;

public class _05_TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("java.lang.String2");
        } catch (ClassNotFoundException e){
            System.out.println("There is not Class.");
        }
    }
}
