package chapter_05;

public class _13_EnumMethodExample {
    public static void main(String[] args) {
        Week today = Week.SUNDAY;

        //name
        String val1 = today.name();
        System.out.println(val1); //SUMDAY

        //ordinal
        int val2 = today.ordinal();
        System.out.println(val2); //SUNDAY = 6

        //compareTo
        Week yesterday = Week.SATURDAY; //5
        int result1 = today.compareTo(yesterday); //6 - 5 = 1
        int result2 = yesterday.compareTo(today); //5 - 6 = -1
        System.out.println(result1);
        System.out.println(result2);

        //valueOF
        Week weekDay = Week.valueOf("SUNDAY");
        if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
            System.out.println("Week End");
        } else
            System.out.println("Week");

        //value
        Week[] oneWeek = Week.values();
        for(Week day :oneWeek){
            System.out.print(day + " ");
        }
    }
}
