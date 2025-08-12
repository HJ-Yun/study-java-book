package chapter_11;

public class _41_ValueCompareExample {
    public static void main(String[] args) {
        System.out.println("[Over the '-128~127']");
        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println("==Compare : " + (obj1 ==obj2));
        System.out.println("UnBoxing compare : " + (obj1.intValue() == obj2.intValue()));
        System.out.println("Equals : " + obj1.equals(obj2));

        System.out.println("\n[In the '-128~127']");
        obj1 = 10;
        obj2 = 10;
        System.out.println("==Compare : " + (obj1 ==obj2));
        System.out.println("UnBoxing compare : " + (obj1.intValue() == obj2.intValue()));
        System.out.println("Equals : " + obj1.equals(obj2));
    }
}
