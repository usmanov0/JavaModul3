package date.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;

public interface SellService {
    double sumOfDay(LocalDate localDate);
    double sumOfHour(LocalTime localTime);
    double sumOfWeek(int weekOfYear);
    double sumOfMonth(int monthYear);
}
