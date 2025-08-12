package chapter_11;

public class _22_StringEqualExample {
    public static void main(String[] args) {
        String strVal1 = new String("Mark");
        String strVal2 = "Mark";

        if (strVal1 == strVal2){
            System.out.println("strVal1 and strVal2 is referencing same object");
        } else {
            System.out.println("strVal1 and strVal2 is not referencing same object.");
        }

        if (strVal1.equals(strVal2)){
            System.out.println("strVal1 and strVal2 is same.");
        } else {
            System.out.println("strVal1 and strVal2 is not same.");
        }
    }
}
