package JavaCollections;

import java.util.HashSet;
import java.util.Set;

public class SetTask1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        set.add("F");
        set.add("G");
        set.add("H");
        set.add("I");
        set.add("J");
        set.add("K");
        set.add("L");
        set.add("M");
        set.add("N");
        set.add("O");
        set.add("P");
        set.add("Q");
        set.add("R");
        set.add("S");
        set.add("T");
        set.add("T");
        set.add("U");
        set.add("V");
        set.add("W");
        set.add("X");
        set.add("Y");
        set.add("Z");
//        for (String string: set) {
//            System.out.print(string+" ");
//        }
        set.forEach(System.out::println);

    }
}
