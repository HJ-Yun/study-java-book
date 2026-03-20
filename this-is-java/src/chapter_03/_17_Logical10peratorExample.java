package chapter_03;

public class _17_Logical10peratorExample {
    public static void main(String[] args) {
        int charCode = 'A';

        if ((charCode >= 65) && (charCode <= 90)){
            System.out.println("Capital Letter");
        }
        if ((charCode >= 97) & (charCode <=122)){
            System.out.println("Small Letter");
        }
        if (!(charCode < 48) && !(charCode > 57)){ // 48 <= charCode <= 57
            System.out.println("Number");
        }

        int value = 6;

        if ((value % 2 == 0) || (value % 3 ==0)){
            System.out.println("value is Multiple of 2 or 3 ");
        }
    }
}
