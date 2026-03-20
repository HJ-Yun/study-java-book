package chapter_11;

public class _07_FinalizeExample {
    public static void main(String[] args) {
        _07_Counter myCounter = null;

        for (int i = 1; i <=50; i++){
            myCounter = new _07_Counter(i);
            myCounter = null;

            System.gc();
        }
    }
}
