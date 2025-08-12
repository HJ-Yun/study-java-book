package chapter_05;

public class _05_ArrayLengthExample {
    public static void main(String[] args) {
        int[] score = {83, 90, 87};

        int sum = 0;
        for (int i = 0; i < score.length; i++){
            sum += score[i];
        }
        System.out.println("Sum = " + sum);

        double avg = (double) sum / score.length;
        System.out.println("Avg = " + avg);
    }
}
