package chapter_10;

public class _03_NunberFormatException {
    public static void main(String[] args) {
        String data1 = "100";
        String data2 = "a100"; //Can not change to int format

        int value1 = Integer.parseInt(data1);
        int value2 = Integer.parseInt(data2); //NumberFormatException

        int result = value1 + value2;
        System.out.println("data1 + data2 = " + result);
    }
}
