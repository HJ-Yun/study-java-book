package chapter_02;

public class _13_OperationsPromotionExample {
    public static void main(String[] args) {
        byte byteValue1 = 10;
        byte byteValue2 = 20;
        //byte byteValue3 = byteValue1 + byteValue2; // Error
        int byteValue3 = byteValue1 + byteValue2;
        System.out.println(byteValue3);

        char charValue1 = 'A';
        char charValue2 = 1;
        //char charValue3 = charValue1 + charValue2; // Error
        int charValue3 = charValue1 + charValue2;
        System.out.println("Unicode : " + charValue3);
        System.out.println("Character : " + (char) charValue3);

        int intValue3 = 10;
        int intValue4 = intValue3 / 4;
        System.out.println(intValue4);

        int intValue5 = 10;
        //int intValue6 = intValue5 / 4.0; // Error
        double doubleValue = intValue5 / 4.0;
        System.out.println(doubleValue);
    }
}
