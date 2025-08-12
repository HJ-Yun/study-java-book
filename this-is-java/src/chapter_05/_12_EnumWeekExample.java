package chapter_05;

import java.util.Calendar;
public class _12_EnumWeekExample {
    public static void main(String[] args) {
        Week today = null;

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR); //Year
        int month = cal.get(Calendar.MONTH) + 1; //Month (1 ~ 12) January is "0"
        int day = cal.get(Calendar.DAY_OF_MONTH); //Day (1 ~ 31)
        int week = cal.get(Calendar.DAY_OF_WEEK); //Week (SUM ~ SAT) Sunday is "1"
        int hour = cal.get(Calendar.HOUR); //Hour (0 ~ 11)
        int fullHour = cal.get(Calendar.HOUR_OF_DAY); //Hour (0 ~ 23)
        int minute = cal.get(Calendar.MINUTE); //Minute (0 ~ 59)
        int second = cal.get(Calendar.SECOND); //Second (0 ~ 59)

        System.out.println("Year = " + year);
        System.out.println("Month = " + month);
        System.out.println("Day = " + day);
        System.out.println("Week = " + week);
        System.out.println("Hour(0~11) = " + hour);
        System.out.println("Hour(0~23) = " + fullHour);
        System.out.println("Minute = " + minute);
        System.out.println("Second = " + second);

        switch (week){
            case 1:
                today = Week.SUNDAY;
                break;
            case 2:
                today = Week.MONDAY;
                break;
            case 3:
                today = Week.TUESDAY;
                break;
            case 4:
                today = Week.WEDNESDAY;
                break;
            case 5:
                today = Week.THURSDAY;
                break;
            case 6:
                today = Week.FRIDAY;
                break;
            case 7:
                today = Week.SATURDAY;
                break;
        }
        System.out.println("Today is " + today);

        if (today == Week.SUNDAY){
            System.out.println("Rest");
        }else
            System.out.println("Study");



    }
}
