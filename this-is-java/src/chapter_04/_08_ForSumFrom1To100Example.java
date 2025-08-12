package chapter_04;

public class _08_ForSumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i<101; i++){
            sum +=i;
        }
        System.out.println("Sum of 1 to 100 is " + sum);
    }
}
