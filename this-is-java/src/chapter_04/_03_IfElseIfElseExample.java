package chapter_04;

public class _03_IfElseIfElseExample {
    public static void main(String[] args) {
        int score = 75;

        if (score >= 90){
            System.out.println("Grade is A");
        } else if (score >= 80) {
            System.out.println("Grade is B");
        } else if (score >= 70) {
            System.out.println("Grade is C");
        }
        else
            System.out.println("Grade is D");
    }
}
