package chapter_04;

public class _16_CountinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <11; i++){
            if (i % 2 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
