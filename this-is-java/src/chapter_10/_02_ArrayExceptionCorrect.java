package chapter_10;

public class _02_ArrayExceptionCorrect {
    public static void main(String[] args) {
        if (args.length == 2){
            String data1 = args[0];
            String data2 = args[1];

            System.out.println("data1 : " + data1);
            System.out.println("data2 : " + data2);
        }else{
            System.out.println("[How to activate]");
            System.out.println("Add the value1 and value2");
        }
    }
}
