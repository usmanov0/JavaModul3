package date.service.impl;

import date.Sell;
import date.data.Data;
import date.service.SellService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;

public class SellServiceImpl implements SellService {
    @Override
    public double sumOfDay(LocalDate localDate) {
        double sum = 0;
        for (int i = 0; i < Data.sells.length; i++) {
            Sell sell = Data.sells[i];
            if (sell!=null){
                LocalDateTime localDateTime = sell.getDate();
                if (localDateTime.getDayOfYear()==localDate.getDayOfYear()) sum+=sell.getPrice();
            }
        }
        return sum;
    }

    @Override
    public double sumOfHour(LocalTime localTime) {
        double sumofhour = 0.0D;
        for (int i = 0; i < Data.sells.length; i++) {
            Sell sell = Data.sells[i];
            if(sell != null){
                LocalDateTime localDateTime = sell.getDate();
                if(localDateTime.getHour()== localTime.getHour()) sumofhour+= sell.getPrice();
            }
        }
        return sumofhour;
    }
    @Override
    public double sumOfWeek(int weekOfYear) {
        double sumofweek = 0.0D;
        for(int i = 0; i < Data.sells.length; i++){
            Sell sell = Data.sells[i];
            if(sell != null){
                LocalDateTime localdate = sell.getDate();
                int week = (367/7) - localdate.getDayOfYear()/7;
                if(week == weekOfYear) sumofweek+= sell.getPrice();
            }
        }
        return sumofweek;
    }
    @Override
    public double sumOfMonth(int monthYear) {
        double sumofmonth = 0;
        for (int i = 0; i < Data.sells.length; i++) {
            Sell sell = Data.sells[i];
            if(sell != null){
                LocalDateTime localdata = sell.getDate();
                Month month = localdata.getMonth();
                if(month.getValue() == monthYear) sumofmonth += sell.getPrice();
            }
        }
        return sumofmonth;
    }
    public double sum(LocalDate from, LocalDate to){
        double sum = 0;
        for (int i = 0; i < Data.sells.length; i++) {
            LocalDate sellDate = Data.sells[i].getDate().toLocalDate();
            if(from.isBefore(sellDate) && to.isAfter(sellDate)){
                sum += Data.sells[i].getPrice();
            }
        }
        return sum;
    }
    public double sumofDay(LocalDate localdate, String zoneId){
        return 0;
    }
}
