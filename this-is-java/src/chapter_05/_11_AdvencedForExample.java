package chapter_05;

public class _11_AdvencedForExample {
    public static void main(String[] args) {
        int[] scoreArray = {95, 71, 84, 93, 87};

        int sum = 0;
        for (int score : scoreArray){
            sum += score;
        }
        System.out.println("Sum is " + sum);
        double avg = (double) sum / scoreArray.length;
        System.out.println("Avg is " + avg);
    }
}
