package Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class  SimpleAlgorithm {
    public static void main(String[] args) {
        var number = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            number.add((int) (Math.random() * 100 + -21));
        }
        System.out.println(number);
        Collections.sort(number);
        System.out.println("Sorted :"+number);
        Collections.shuffle(number);
        System.out.println("Shuffled :"+number); //elementlarni random indexlarga qo'yib tashlaydi;
        //System.out.println(Collections.max(number));
        //System.out.println(Collections.min(number));
        //System.out.println(Collections.emptyList());
        Predicate<Integer> predicate = (numbers) -> numbers < 0;
        System.out.println(number.removeIf(predicate));
        System.out.println(number);
        Collections.reverse(number);
        System.out.println("Reversed :"+number);
        System.out.println(Collections.frequency(number, 76)); // element nechta uchraganini tekshiradi;


    }
}
