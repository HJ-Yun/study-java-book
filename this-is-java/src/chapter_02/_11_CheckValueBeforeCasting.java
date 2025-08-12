package chapter_02;

public class _11_CheckValueBeforeCasting {
    public static void main(String[] args) {
        int i =128;
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        if ((i < Byte.MIN_VALUE) || (i > Byte.MAX_VALUE)){  // || <--- OR
            System.out.println("Result : Can not changed");
            System.out.println("         Check the Byte Value");
        }
        else {
            byte b = (byte) i;
            System.out.println(b);
        }
    }
}
