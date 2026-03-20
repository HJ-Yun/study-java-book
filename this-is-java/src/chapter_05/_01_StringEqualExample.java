package chapter_05;

public class _01_StringEqualExample {
    public static void main(String[] args) {
        String strVar1 = "Mark";
        String strVar2 = "Mark";

        if (strVar1 == strVar2){ //Same
            System.out.println("Same");
        }else
            System.out.println("Different");

        if (strVar1.equals(strVar2)){ //Same
            System.out.println("Same");
        }

        String strVar3 = new String("Mark");
        String strVar4 = new String("Mark");

        if (strVar3 == strVar4){ //Different
            System.out.println("Same");
        }else
            System.out.println("Different");

        if (strVar3.equals(strVar4)){ //Same
            System.out.println("Same");
        }
    }
}
