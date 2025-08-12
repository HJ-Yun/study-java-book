package chapter_05;

public class _02_ArrayCreateByValueListExample {
    public static void main(String[] args) {
        int score[] = {83, 90, 87};

        System.out.println("Score[0] = " + score[0]);
        System.out.println("Score[1] = " + score[1]);
        System.out.println("Score[2] = " + score[2]);

        int sum = 0;
        int i;
        for (i = 0; i < 3; i++){
            sum += score[i];
        }
        System.out.println("Sum = " + sum);
        double avr = (double) sum / i;
        System.out.println("Average = " + avr);
    }
}
