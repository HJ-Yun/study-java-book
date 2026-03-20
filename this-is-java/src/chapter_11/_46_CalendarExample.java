package chapter_11;

import java.util.Calendar;

public class _46_CalendarExample {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        int month  = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        int week = now.get(Calendar.DAY_OF_WEEK);
        String strWeek = null;
        switch (week){
            case Calendar.MONDAY:
                strWeek = "月";
                break;
            case Calendar.TUESDAY:
                strWeek = "火";
                break;
            case Calendar.WEDNESDAY:
                strWeek = "水";
                break;
            case Calendar.THURSDAY:
                strWeek = "木";
                break;
            case Calendar.FRIDAY:
                strWeek = "金";
                break;
            case Calendar.SATURDAY:
                strWeek = "土";
                break;
            default:
                strWeek = "日";
        }

        int amPm = now.get(Calendar.AM_PM);
        String strAmPm = null;
        if (amPm == Calendar.AM){
            strAmPm = "Morning";
        } else {
            strAmPm = "Afternoon";
        }

        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        System.out.println("year : " + year);
        System.out.println("month : " + month);
        System.out.println("day : " + day);
        System.out.println(strWeek + "曜日");
        System.out.println(strAmPm + " " + hour + " " + minute + " " + second);
    }
}
