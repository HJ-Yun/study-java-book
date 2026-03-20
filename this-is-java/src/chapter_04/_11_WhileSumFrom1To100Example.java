package chapter_04;

public class _11_WhileSumFrom1To100Example {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i < 101){
            sum += i;
            i++;
        }
        System.out.println("Sum of 1 to " + (i-1) + " is " + sum);
    }
}
