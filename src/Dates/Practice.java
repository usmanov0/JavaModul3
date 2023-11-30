package Dates;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class Practice {
    public static void main(String[] args) {
        //LocalDate
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(-1);
        LocalDate tomorrow = date.plusDays(+1);
        LocalDate after_tomorrow = yesterday.plusDays(+3);
        System.out.println("Current date: "+date);
        System.out.println("Yesterday date: "+yesterday);
        System.out.println("Tomorrow date: "+tomorrow);
        System.out.println("After tomorrowdate: "+after_tomorrow+"\n");

        LocalDate date1 = LocalDate.of(2017,01,13);
        System.out.println("Is Leap or not: "+date.isLeapYear());
        LocalDate date2 = LocalDate.of(2015,01,12);
        System.out.println("Is leap or not: "+date2.isLeapYear()+"\n");

        LocalDate datee1 = LocalDate.of(2023,2,13);
        LocalDateTime datee2 = date.atTime(2,0,0);
        System.out.println(datee2+"\n");

        LocalDate d1 = LocalDate.now();
        String d1str = d1.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Date1 in string: "+d1str);

        LocalDate d2 = LocalDate.of(2022,1,13);
        String d2str = d2.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Date2 in string: "+d2str+"\n"+"\n");

        //LocalDateTime
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before Formatting: "+now);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDate = now.format(format);
        System.out.println("After Formatting: "+formatDate+"\n"+"\n");

        //LocalDateTime a = LocalDateTime.of(2023,2,13,15,56);
        LocalDateTime a = LocalDateTime.now();
        System.out.println(a.get(ChronoField.DAY_OF_WEEK));
        System.out.println(a.get(ChronoField.DAY_OF_YEAR));
        System.out.println(a.get(ChronoField.DAY_OF_MONTH));
        System.out.println(a.get(ChronoField.HOUR_OF_DAY));
        System.out.println(a.get(ChronoField.MINUTE_OF_DAY)+"\n");

        LocalDateTime time = LocalDateTime.now();
        LocalDateTime time1 = time.plusDays(120);
        System.out.println(time1);

        LocalDateTime time2 = LocalDateTime.now();
        LocalDateTime time3 = time2.minusDays(120);
        System.out.println(time3+"\n");

        //Months Day
        MonthDay month = MonthDay.now();
        LocalDate data = month.atYear(2000);
        System.out.println(data);

        MonthDay month1 = MonthDay.now();
        boolean b = month1.isValidYear(2012);
        System.out.println(b);

        MonthDay monthDay = MonthDay.now();
        long l = monthDay.get(ChronoField.MONTH_OF_YEAR);
        System.out.println(l);

        MonthDay monthDay1 = MonthDay.now();
        ValueRange v1 = monthDay1.range(ChronoField.MONTH_OF_YEAR);
        System.out.println(v1);

        MonthDay monthDay2 = MonthDay.now();
        ValueRange v2 = monthDay2.range(ChronoField.DAY_OF_MONTH);
        System.out.println(v2+"\n"+"\n");

        //OffsetTime
        OffsetTime offsetTime = OffsetTime.now();
        int h = offsetTime.get(ChronoField.HOUR_OF_DAY);
        System.out.println("Hour of day: "+h);
        int m = offsetTime.get(ChronoField.MINUTE_OF_DAY);
        System.out.println("Hour of day: "+m);
        int s = offsetTime.get(ChronoField.SECOND_OF_DAY);
        System.out.println("Second of day: "+s+"\n");

        OffsetTime offset = OffsetTime.now();
        int hour = offset.getHour();
        System.out.println("Hour: "+hour);
        OffsetTime offset1 = OffsetTime.now();
        int minute = offset1.getMinute();
        System.out.println("Minute: "+minute);
        OffsetTime offset2 = OffsetTime.now();
        int second = offset2.getSecond();
        System.out.println("Second: "+second+"\n"+"\n");

        //OffsetDateTime
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println("Day of Month: "+offsetDateTime.getDayOfMonth());
        OffsetDateTime offsetDateTime1 = OffsetDateTime.now();
        System.out.println("Day of Year: "+offsetDateTime1.getDayOfYear());
        OffsetDateTime offsetDateTime2 = OffsetDateTime.now();
        System.out.println("Day of Week: "+offsetDateTime2.getDayOfWeek());
        OffsetDateTime offsetDateTime3 = OffsetDateTime.now();
        System.out.println("Local Date: "+offsetDateTime3.toLocalDate());
    }
}
