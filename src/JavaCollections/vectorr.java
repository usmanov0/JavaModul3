package JavaCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class vectorr {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(15);
        vector.add(0,10);
        vector.add(1,10);
        vector.add(2,10);
        vector.add(3,10);
        vector.add(4,50);
        vector.clone();
        //vector.clear();
        System.out.println(vector.elementAt(4));
        System.out.println(vector);
    }
}
