package chapter_06;

public class _07_Computer {
    int sum1(int[] value){
        int sum = 0;
        for (int i = 0; i < value.length; i++){
            sum += value[i];
        }
        return sum;
    }

    int sum2(int ... value){
        int sum = 0;
        for (int i = 0; i < value.length; i++){
            sum += value[i];
        }
        return sum;
    }

}
