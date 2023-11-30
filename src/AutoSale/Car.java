package AutoSale;

public class Car {
    String model;
    String brand;
    boolean isAutomatic;
    double price;
    float tank;

    public Car(String model, String brand, boolean isAutomatic, double price, float tank) {
        this.model = model;
        this.brand = brand;
        this.isAutomatic = isAutomatic;
        this.price = price;
        this.tank = tank;
    }
    public String toPrint(){
        return "Modeli "+model + " Brand "+ brand + " Korobka "+isAutomatic + "Narxi "+price + "Bak Sig'imi "+tank;
    }
}
