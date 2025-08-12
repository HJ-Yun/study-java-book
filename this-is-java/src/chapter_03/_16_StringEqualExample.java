package chapter_03;

public class _16_StringEqualExample {
    public static void main(String[] args) {
        String strVar1 = "ABC";
        String strVar2 = "ABC";
        String strVar3 = new String ("ABC");

        System.out.println(strVar1 == strVar2); //true
        System.out.println(strVar1 == strVar3); //false
        System.out.println();
        System.out.println(strVar1.equals(strVar2)); //true
        System.out.println(strVar1.equals(strVar3)); //true
    }
}
