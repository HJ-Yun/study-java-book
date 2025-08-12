package chapter_11;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class _44_RandomExample {
    public static void main(String[] args) {
        int[] selectNumber = new int[6];
        Random random = new Random(3);

        System.out.print("select number : ");
        for (int i = 0; i < 6 ; i++){
            selectNumber[i] = random.nextInt(45) + 1;
            System.out.print(selectNumber[i] + " ");
        }

        int[] winningNumber = new int[6];
        random = new Random(5);

        System.out.print("\nWinning number : ");
        for (int i= 0; i < 6; i++){
            winningNumber[i] = random.nextInt(45) + 1;
            System.out.print(winningNumber[i] + " ");
        }

        Arrays.sort(selectNumber);
        Arrays.sort(winningNumber);
        boolean result = Arrays.equals(selectNumber,winningNumber);
        System.out.print("\nResult = ");
        if (result){
            System.out.println("Win");
        } else {
            System.out.println("Lose");
        }
    }
}
