package date;

import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Sell {
    private String name;
    private Double price;
    private LocalDateTime date  = LocalDateTime.now();

    public Sell(String name, Double price) {
        this.name = name;
        this.price = price;
        int i = Calendar.getInstance().get(Calendar.WEEK_OF_YEAR);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
