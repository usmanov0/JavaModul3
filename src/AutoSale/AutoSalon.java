package AutoSale;

import java.util.Scanner;
public class AutoSalon {
    String name;
    String address;
    double balance;
    double profit;
    Car[] cars = new Car[10];
    static float dollar = 11500;

    public AutoSalon(String name, String address, double balance) {
        this.name = name;
        this.address = address;
        this.balance = balance;
    }
    public void info(){
        System.out.println("Nomi-> "+name+"\n"+"Address-> "+address+"\n"+"Balans-> "+balance);
    }
    public void addAuto(Scanner scanner){
        double price = 265000;
        if(balance>=price){
            Car car = new Car("Gm63","Mercedes-Benz",true,price,70);
            for(int i = 0; i < cars.length; i++){
                if(cars[i]==null){
                    cars[i]=car;
                    break;
                }
            }
            this.balance-=price;
        }else{
            System.out.println("Not enought budget");
        }
        System.out.println("Added");
    }
    public void viewAuto(){
        for(int i = 0; i < cars.length; i++){
            if(cars[i]==null) continue;
            Car car = cars[i];
            System.out.println(car.toPrint());
        }
    }
}
