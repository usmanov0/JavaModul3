package JavaCollections;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        TreeSet<Integer> treeset = new TreeSet<>();
        treeset.add(20);
        treeset.add(10);
        treeset.add(20);
        treeset.add(7);
        treeset.add(1);
        treeset.add(8);
        System.out.println(treeset);
        System.out.println(treeset.descendingSet());
        System.out.println(treeset.tailSet(1,false));
//        System.out.println(treeset.subSet(7, 20));
//        System.out.println(treeset.higher(1));
//        System.out.println(treeset.lower(20));
//        System.out.println(treeset.floor(6));
//        System.out.println(treeset.ceiling(6));
        //System.out.println(treeset.pollFirst()); kichkina qiymatni;
        //System.out.println(treeset.pollLast());  katta qiymatni;

//        HashSet<String> set = new HashSet<>();
//        set.add("apple");
//        set.add("appl");
//        set.add("apple2");
//        set.add("apple3");
//        System.out.println(set);
//        TreeSet<String> tree = new TreeSet<>(set);
//        System.out.println(tree);
    }
}
