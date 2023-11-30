package JavaCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class ListsTask1 {

    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            int rand = random.nextInt(100);
            integers.add(rand);
        }

        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }
        System.out.println();

        int removeeindex = random.nextInt(integers.size());
        int removenum = integers.remove(removeeindex);
        System.out.println(removeeindex+"-chi indexdagi " + " : "+removenum+"-soni o'chirildi");
        System.out.println(integers);
    }
}
