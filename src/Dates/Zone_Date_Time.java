package Dates;

import java.time.ZonedDateTime;

public class Zone_Date_Time {
    public static void main(String[] args) {
        ZonedDateTime zone = ZonedDateTime.parse("2023-10-05T08:20:10+05:30[Asia/Tashkent]");
        System.out.println(zone);

        ZonedDateTime zone1 = ZonedDateTime.now();
        System.out.println(zone1.getZone());
    }
}
