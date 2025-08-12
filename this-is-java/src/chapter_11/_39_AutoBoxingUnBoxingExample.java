package chapter_11;

public class _39_AutoBoxingUnBoxingExample {
    public static void main(String[] args) {
        //Normal Boxing
        //Integer obj = new Integer(100);

        //Auto Boxing
        Integer obj = 100;
        System.out.println("value : " + obj.intValue());

        //Normal UnBoxing
        //int value = obj.intValue();

        //Auto UnBoxing
        int value = obj;
        System.out.println("value : " + value);

        //Auto UnBoxing
        int result = obj + value;
        System.out.println("sum : " + result);
    }
}
