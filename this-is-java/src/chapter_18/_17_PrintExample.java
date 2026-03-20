package chapter_18;

import java.util.Date;

public class _17_PrintExample {
    public static void main(String[] args) {
        System.out.printf("Price : %d\n",123);
        System.out.printf("Price : %6d\n",123);
        System.out.printf("Price : %-6d\n",123);
        System.out.printf("Price : %06d\n",123);

        System.out.printf("Circle(R : %d) Area : %10.2f\n",10,Math.PI*Math.pow(10,2));

        Date now = new Date();
        System.out.printf("Today is %tY. %tm. %td\n",now,now,now);
        System.out.printf("Today is %1$tY. %1$tm. %1$td\n",now);
        System.out.printf("Time is %1$tH:%1$tM:%1$tS",now);
    }
}
