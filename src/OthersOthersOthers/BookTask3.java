package OthersOthersOthers;

import java.util.*;

public class BookTask3 {
    public static void main(String[] args) throws InterruptedException {
        LinkedList<String> list1 = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();
        list1.add("The top ten");
        list1.add("The power of discipline");
        list1.add("It ends with us");
        list1.add("Atomic habits");
        list1.add("Make your bed");
        list1.add("The silent patient");
        list1.add("The family across the street");
        list1.add("The wife before");
        list1.add("I am watching you");
        list1.add("The couple next door");
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(list1.size());
            list2.add(list1.get(index));
        }
        System.out.println("List 1: "+list1);
        System.out.println("List 2ga List 1 dan 5 ta kitob tanlab olindi: "+list2);

        Thread.sleep(3000);
        for (String elements : list2) {
            if(list1.contains(elements)){
                list1.remove(elements);
            }
        }
        System.out.println();
        System.out.println(list2);
        System.out.println("List 1 dan List 2 da bor elementlar o'chirib tashalndi: "+list1);
    }

}
