package OthersOthersOthers;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Task2 {
    public static <T> ArrayList<T> removedub(List<String> list){
        ArrayList<T> arrayList = new ArrayList<T>();
        for (String element: list){
            if(!arrayList.contains(element)){
                arrayList.add((T) element);
            }
        }
        return arrayList;
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Muhammad Ali");
        list.add("Alisher");
        list.add("Kamol");
        list.add("Yusuf");
        list.add("A'zam");
        list.add("Bahodir");
        list.add("Umar");
        list.add("Rustam");
        list.add("Rustam");
        list.add("Navruz");
        list.add("Bahodir");
        list.add("Fazliddin");
        list.add("To'lqin");
        list.add("To'lqin");
        list.add("Islom");
        list.add("Iskandar");
        list.add("Islom");
        list.add("Alisher");
        list.add("Iskandar");
        list.add("A'zam");

        System.out.println(list);

        ArrayList<String> arrayList = removedub(list);
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            String names = iterator.next();
            System.out.println(names);
        }
    }
}
