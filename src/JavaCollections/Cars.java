package JavaCollections;

import javax.swing.plaf.basic.BasicTextUI;

public class Cars {
    public String Model;
    public String Color;
    public int Max_Speed;

    public Cars(String model, String color, int max_Speed) {
        Model = model;
        Color = color;
        Max_Speed = max_Speed;
    }

    public String getModel() {
        return Model + Color + Max_Speed;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getMax_Speed() {
        return Max_Speed;
    }

    public void setMax_Speed(int max_Speed) {
        Max_Speed = max_Speed;
    }
}
