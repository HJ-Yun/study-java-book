package chapter_02;

public class _09_PromotionExample {
    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = byteValue; //int <--- byte
        System.out.println(intValue);

        char charValue = 'あ';
        intValue = charValue; //int <--- char
        System.out.println(intValue);

        intValue = 500;
        long longValue = intValue; //long <--- int
        System.out.println(longValue);

        intValue = 200;
        double doubleValue = intValue; // double <--- int
        System.out.println(doubleValue);
    }
}
