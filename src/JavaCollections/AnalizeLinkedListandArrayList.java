package JavaCollections;

import java.util.ArrayList;
import java.util.LinkedList;

public class AnalizeLinkedListandArrayList {
    public static void main(String[] args) {
        var arrlist = new ArrayList<Integer>();
        var linkedlist = new LinkedList<Integer>();
        final var max_sss = 100000;
        var start = System.currentTimeMillis();
        addtoArray(arrlist,max_sss);
        var end = System.currentTimeMillis();
        System.out.println("ArrayList: "+(end-start));

        start = System.currentTimeMillis();
        addtoLinkedList(linkedlist,max_sss);
        end = System.currentTimeMillis();
        System.out.println("LinkedList: "+(end-start));

        start = System.currentTimeMillis();
        removeFromBeginning(arrlist);
        end = System.currentTimeMillis();
        System.out.println("ArrayList (remove)-"+(end-start));

        start = System.currentTimeMillis();
        removeFromBeginning(linkedlist);
        end = System.currentTimeMillis();
        System.out.println("LinkedList (remove)-"+(end-start));
    }
    public static void addtoArray(ArrayList<Integer> arrlist, int max_sss){
        for (int i = 0; i < max_sss; i++) {
            arrlist.add(0,i);
        }
    }
    public static void addtoLinkedList(LinkedList<Integer> linkedList, int max_sss){
        for (int i = 0; i < max_sss; i++) {
            linkedList.add(0,i);
        }
    }
    public static void removeFromBeginning(ArrayList<Integer> arrayList){
        for (int i = 0; i < 1000; i++){
            arrayList.remove(0);
        }
    }
    public static void removeFromBeginning(LinkedList<Integer> linkedList){
        for (int i = 0; i < 10000; i++) {
            linkedList.remove(0);
        }
    }
}
