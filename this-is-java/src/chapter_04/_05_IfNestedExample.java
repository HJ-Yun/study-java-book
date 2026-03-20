package chapter_04;
public class _05_IfNestedExample {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 100) + 1;
        System.out.println("Score is " + score);
        String grade;

        if (score >=90){
            if (score >= 95){
                grade = "A+";
            }
            else
                grade = "A";
        }
        else{
            if (score >= 85){
                grade = "B";
            }
            else
                grade = "C";
        }
        System.out.println("Grade is " + grade);
    }
}
