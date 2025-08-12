package chapter_04;

public class _12_WhileKeyControlExample {
    public static void main(String[] args) throws Exception {
        boolean run = true;
        int speed = 0;
        int keyCode = 0;
        System.out.println("Current Speed is " + speed);

        while (run) {
            if (keyCode != 13 && keyCode != 10) {
                System.out.println("-----------");
                System.out.println("1 : faster | 2 : Slower | 3 : Stop");
                System.out.println("-----------");
                System.out.print("Input : ");
            }

            keyCode = System.in.read();

            if (keyCode == 49) {
                speed++;
                System.out.println("Current Speed is " + speed);
            } else if (keyCode == 50) {
                speed--;
                System.out.println("Current Speed is " + speed);
            } else if (keyCode == 51) {
                run = false;
            }
        }
        System.out.println("Stop");
    }
}