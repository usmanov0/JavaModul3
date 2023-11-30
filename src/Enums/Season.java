package Enums;

public enum Season {
    SUMMER("Yoz",90),
    AUTUMN("Kuz",90),
    WINTER("Qish",90),
    SPRING("Bahor",95);

    private String name;
    private int day;

    Season(String name, int day){
        this.day=day;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }
}