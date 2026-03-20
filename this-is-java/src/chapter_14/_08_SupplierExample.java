package chapter_14;

import java.util.function.IntSupplier;

public class _08_SupplierExample {
    public static void main(String[] args) {
        IntSupplier intSupplier = () -> {
            int num = (int) (Math.random() * 6) + 1;
            return num;
        };

        int dice = intSupplier.getAsInt();
        System.out.println("Dice : " + dice);


    }
}
