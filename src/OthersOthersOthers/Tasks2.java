package OthersOthersOthers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Tasks2 {
    public static <T> LinkedList<T> removedub(LinkedList<String> list) {
        LinkedList<T> linkedList = new LinkedList<T>();
        for (String element : list) {
            if (!linkedList.contains(element)) {
                linkedList.add((T) element);
            }
        }
        return linkedList;
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

        LinkedList<String> linkedList = removedub((LinkedList<String>) list);
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            String names = iterator.next();
            System.out.println(names);
        }
    }
}
