package Dates;

import java.time.Clock;

public class Clocks {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.getZone()+"\n");

        Clock clock1 = Clock.systemUTC();
        System.out.println(clock1.instant());
    }
}
