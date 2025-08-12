package chapter_07;

public class _03_Computer extends _03_Calculator {
    @Override
    double areaCircle(int r){
        System.out.println("Computer Activate");
        return Math.PI * r * r;
    }

}
