package chapter_11;

import java.util.TimeZone;

public class _47_PrintTimeZoneID {
    public static void main(String[] args) {
        String[] availableIDs = TimeZone.getAvailableIDs();
        for (String id : availableIDs){
            System.out.println(id);
        }
    }
}
