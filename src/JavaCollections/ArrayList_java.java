package JavaCollections;
import java.util.ArrayList;
public class ArrayList_java {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,1);
        list.add(1,2);
        list.add(2,3);
        list.add(3,6);
        list.add(4,5);
        for (Object s:list) {System.out.println(s);}
        list.forEach(s ->{System.out.println(s);});
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.contains(6));
        System.out.println(list.iterator());

        ArrayList<Cars> cars = new ArrayList<>();
        Cars car1 = new Cars("Captiva ","Blue ",260);
        Cars car2 = new Cars("Equinox ","Black ",280);
        Cars car3 = new Cars("Traverse ","Red ",300);
        System.out.println(car1.getModel());
        System.out.println(car2.getModel());
        System.out.println(car3.getModel());

//        ArrayList arrayList = new ArrayList();
//        arrayList.add(6,3);
//        arrayList.add(1,10);
//        System.out.println(arrayList.get(1));  // Runtime Exception

    }
}
