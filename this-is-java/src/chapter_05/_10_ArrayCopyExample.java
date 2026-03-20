package chapter_05;

public class _10_ArrayCopyExample {
    public static void main(String[] args) {
        String[] oldArray = {"ABC", "DEF", "GHI"};
        String[] newArray = new String[5];

        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);

        for (int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + ", ");
        }
    }
}
