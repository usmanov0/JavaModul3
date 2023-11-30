package JavaCollections;


import javax.sound.sampled.Line;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
//        LinkedList<String > list1 = new LinkedList<>();
//        LinkedList<String > list2 = new LinkedList<>();
//        list1.add("Abror");
//        list1.add("Humoyun");
//        list1.add("Azizbek");
//        list1.add("Umarbek");
//        list1.add("Ismoil");
//        list1.add("Shavkat");
//        list1.add("Abdulla");
//        list1.add("Abdusalom");
//        list1.add("Salim");
//        list1.add("G'ofur");
//
//
//        list2.add("Александр");
//        list2.add("Михаил");
//        list2.add("Леня");
//        list2.add("Анна");
//        list2.add("Владимир");
//        list2.addAll(list1);
//        list2.addFirst("Usmonov Azizbek");
//        list2.addLast("Usmonov Azizbek");
//        Iterator<String> iterator = list2.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next()  );
//        }

        LinkedList<Integer> objects = new LinkedList<>();
        objects.add(3);
        objects.add(2);
        objects.add(1);
        objects.add(4);
        objects.add(10);
        System.out.println(objects+" Kirish Tartibida");

        Collections.sort(objects);
        System.out.println(objects +" Sortlangan holati");

        Collections.reverse(objects);

        System.out.println(objects+ " Sort By desc");
    }
}
