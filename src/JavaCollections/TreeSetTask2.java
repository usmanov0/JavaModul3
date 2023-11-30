package JavaCollections;

import java.util.TreeSet;

public class TreeSetTask2 {
    public static void main(String[] args) {
        TreeSet<Integer> treeset = new TreeSet<>();
        treeset.add(110);
        TreeSet<Integer> treeset1 = new TreeSet<>();
        treeset1.add(1);
        System.out.println(treeset.equals(treeset1));
        System.out.println(treeset.hashCode());
        //System.out.println(treeset.descendingSet());
    }
}
