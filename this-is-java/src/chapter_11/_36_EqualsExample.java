package chapter_11;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _36_EqualsExample {
    public static void main(String[] args) {
        int[][] original = {{1,2}, {3,4}};

        System.out.println("Soft copy");
        int[][] cloned1 = Arrays.copyOf(original,original.length);

        System.out.println("Reference : " + original.equals(cloned1));
        System.out.println("Equals : " + Arrays.equals(original,cloned1));
        System.out.println("Deep Equals : " + Arrays.deepEquals(original,cloned1));

        System.out.println("\nDeep copy");
        int [][] cloned2 = Arrays.copyOf(original,original.length);
        cloned2[0] = Arrays.copyOf(original[0],original[0].length);
        cloned2[1] = Arrays.copyOf(original[1],original[1].length);

        System.out.println("Referenc : " + original.equals(cloned2));
        System.out.println("Equals : " + Arrays.equals(original,cloned2));
        System.out.println("Deep Equals : " + Arrays.deepEquals(original,cloned2));


    }
}
