package Algorithms;

import java.io.ObjectStreamException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arrayithms {
    public static void main(String[] args) {
        var names = new String[]{"Name","Call","John","Jonson","Neymar","Ronaldo",
        "Messi","Maradonna","Mbappe","e.d.g"};
        List<String> list = List.of(names); //Array to List;
        System.out.println(list);
        String[] objects = list.toArray(String[]::new);
        System.out.println(Arrays.toString(objects));
        System.out.println(Collections.binarySearch(list, "e.d.g"));
    }
}
