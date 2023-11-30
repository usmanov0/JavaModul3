package Dates;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalTime;
import java.time.ZoneId;

public class Zone_Id {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.of("Asia/Tashkent");
        ZoneId zone1 = ZoneId.of("Asia/Tokyo");
        LocalTime z = LocalTime.now(zone);
        LocalTime z1 = LocalTime.now(zone1);
        System.out.println(z);
        System.out.println(z1);
        System.out.println(z.isBefore(z1));
        System.out.println(z.isAfter(z1));

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);


    }
}
