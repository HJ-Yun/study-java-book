package chapter_11;

public class _40_StringToPrimitiveValueExample {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("100");
        double value2 = Double.parseDouble("3.145");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1 : " + value1);
        System.out.println("value2 : " + value2);
        System.out.println("value3 : " + value3);
    }
}
