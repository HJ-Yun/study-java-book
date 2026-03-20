package chapter_06;

public class _09_Calculator {
    void execute(){
        double result = avr(7, 10);
        printLn("Result is " + result);
    }
    double avr (int x, int y){
        double sum = plus(x, y);
        double result = sum / 2;
        return result;
    }
    int plus (int x, int y){
        int result = x + y;
        return result;
    }
    void printLn(String message){
        System.out.println(message);
    }
    
}
