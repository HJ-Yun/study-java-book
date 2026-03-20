package chapter_10;

public class _02_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        String data1 = args[0];
        String data2 = args[1];
        //There is no value in args [○, ○]

        System.out.println("args[0] : " + data1);
        System.out.println("args[1] : " + data2);
    }
}
