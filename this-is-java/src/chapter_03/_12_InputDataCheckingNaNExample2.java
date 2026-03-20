package chapter_03;

public class _12_InputDataCheckingNaNExample2 {
    public static void main(String[] args) {
        String userInput = "NaN";
        double val = Double.valueOf(userInput);

        double currentBalance = 10000.0;

        if (Double.isNaN(val)){
            System.out.println("NaN");
            val = 0.0;
        }
        currentBalance += val;
        System.out.println(currentBalance);
    }
}
