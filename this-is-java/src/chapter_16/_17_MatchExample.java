package chapter_16;

import java.util.Arrays;

public class _17_MatchExample {
    public static void main(String[] args) {
        int[] intArr = {2,4,6};
        System.out.printf("[ %d %d %d ]\n",intArr[0],intArr[1],intArr[2]);

        boolean result = Arrays.stream(intArr)
                .allMatch(a-> a%2==0);
        System.out.println("All match a%2 : " + result);

        result = Arrays.stream(intArr)
                .anyMatch(a-> a%3==0);
        System.out.println("Any match a%3 : " + result);

        result = Arrays.stream(intArr)
                .noneMatch(a-> a%3==0);
        System.out.println("Non match a%3 : " + result);
    }
}
