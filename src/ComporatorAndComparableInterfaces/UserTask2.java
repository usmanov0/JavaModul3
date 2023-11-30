package ComporatorAndComparableInterfaces;

import java.util.PriorityQueue;

public class UserTask2 implements Comparable<UserTask2>{
    String name;
    String phone;

    public UserTask2(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
    @Override
    public String toString() {
        return name + ":" +phone;
    }
    @Override
    public int compareTo(UserTask2 o) {
        int namecompare = name.compareTo(o.name);
        if(namecompare != 0){
            return namecompare;
        }
        return phone.compareTo(o.phone);
    }

    public static void main(String[] args) {
        PriorityQueue<UserTask2> priorityQueue= new PriorityQueue<>();
        priorityQueue.add(new UserTask2("Alisher","+998-90-561-10-60"));
        priorityQueue.add(new UserTask2("G'anisher","+998-90-123-56-60"));
        priorityQueue.add(new UserTask2("G'aybulla","+998-90-123-45-65"));
        priorityQueue.add(new UserTask2("Azizbek","+998-90-321-54-76"));
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
    }


}
