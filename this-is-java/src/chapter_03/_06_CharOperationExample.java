package chapter_03;

public class _06_CharOperationExample {
    public static void main(String[] args) {
        char c1 = 'A' + 1;
        char c2 = 'A';
        //char c3 = c2 + 1; //Error
        char c3 = (char) (c2 + 1);
        System.out.println("c1 = " + c1);
        System.out.println("c3 = " + c3);
    }
}
