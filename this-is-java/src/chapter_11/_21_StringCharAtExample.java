package chapter_11;

public class _21_StringCharAtExample {
    public static void main(String[] args) {
        String ssn = "010524-1230123";
        char sex = ssn.charAt(7);

        switch (sex){
            case '1':
            case '3':
                System.out.println("this is man.");
                break;

            case '2':
            case '4':
                System.out.println("this is woman");
                break;
        }
    }
}
