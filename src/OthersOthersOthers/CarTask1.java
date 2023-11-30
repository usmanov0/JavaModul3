//import java.util.Map;
//import java.util.HashMap;
//
//public class CarTask1 {
//    private String name;
//    private String color;
//    private String model;
//    public CarTask1(String name, String color, String model) {
//        this.name = name;
//        this.color = color;
//        this.model = model;
//    }
//    public String getName() {
//        return name;
//    }
//    public String getColor() {
//        return color;
//    }
//    public String getModel() {
//        return model;
//    }
//
//    public static void main(String[] args) {
//        Map<CarTask1,Double> carTask1IntegerMap = new HashMap<>();
//        CarTask1 car1 = new CarTask1("Lamborgini Urus","White","Lamborghini");
//        carTask1IntegerMap.put(car1,454_000D);
//        CarTask1 car2 = new CarTask1("GT 53","Black","Mercedes Benz");
//        carTask1IntegerMap.put(car2,250_000D);
//        CarTask1 car3 = new CarTask1("I5","Blue","BMW");
//        carTask1IntegerMap.put(car3,300_000D);
//        for(Map.Entry<CarTask1,Double> carr: carTask1IntegerMap.entrySet()){
//            CarTask1 car = carr.getKey();
//            Double price = carr.getValue();
//            System.out.println(car.getName() + " "+car.getColor() + " "+car.getModel()+" - "+price+"$");
//        }
//        PriceLess(carTask1IntegerMap,400_000);
//    }
//    public static void PriceLess(Map<CarTask1,Double>carTask1IntegerMap,int limit){
//        System.out.println("Less than limit ");
//        for (Map.Entry<CarTask1,Double> cars: carTask1IntegerMap.entrySet()){
//            if (cars.getValue() < limit){
//                CarTask1 car = cars.getKey();
//                Double price = cars.getValue();
//                System.out.println(car.getName()+" "+car.getColor()+" "+car.getModel()+"-"+price+"$");
//            }
//        }
//    }
//}
