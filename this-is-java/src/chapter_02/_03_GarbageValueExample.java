package chapter_02;

public class _03_GarbageValueExample {
    public static void main(String[] args) {
        byte var1 = 125;
        int var2 = 125;

        for (int i = 0; i < 5; i++){ //repeat 5 times (from 0 to 4)
            var1++;
            var2++;
            System.out.println("var1: " + var1 + "\t" + "var2: " + var2); // "\t" is tap space
        }
    }
}
