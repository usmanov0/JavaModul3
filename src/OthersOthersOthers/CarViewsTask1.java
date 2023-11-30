//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.ListIterator;
//
//public class CarViewsTask1 {
//    String name;
//    String color;
//    String model;
//
//    public CarViewsTask1(String name, String color, String model) {
//        this.name = name;
//        this.color = color;
//        this.model = model;
//    }
//
//    @Override
//    public String toString() {
//        return "CarViewsTask3{" +
//                "name='" + name + '\'' +
//                ", color='" + color + '\'' +
//                ", model='" + model + '\'' +
//                '}';
//    }
//
//    public static void main(String[] args) {
//        List<CarViewsTask1> cars = new ArrayList<>();
//
//        cars.add(new CarViewsTask1("Captiva","Black","Chevrolet"));
//        cars.add(new CarViewsTask1("Nexia","White","Ravon"));
//        cars.add(new CarViewsTask1("Mersedez Gt-53","White","Blue"));
//
//        System.out.println("Print with Iterator");
//        Iterator<CarViewsTask1> iterator = cars.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        System.out.println("Print with ListIterator");
//        ListIterator<CarViewsTask1> iterator1 = cars.listIterator();
//        while (iterator1.hasNext()){
//            System.out.println(iterator1.next());
//        }
//    }
//}
