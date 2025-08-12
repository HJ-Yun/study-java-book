package chapter_03;

public class _21_ConditionOperationExample {
    public static void main(String[] args) {
        int score = 85;
        char grade = score > 90 ? 'A' : (score > 80 ? 'B' : 'C');
        System.out.println("Grade is " + grade);
    }
}
