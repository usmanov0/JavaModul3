package Queues;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueuess {
    public static void main(String[] args) {
        var priority = new PriorityQueue<String>();
        priority.add("Java");
        priority.add("Kotlin");
        priority.add("C++");
        priority.add("C#");
        System.out.println(priority.peek());
        System.out.println(priority.poll()); // remove first element and return it;
        System.out.println(priority);
    }
}
