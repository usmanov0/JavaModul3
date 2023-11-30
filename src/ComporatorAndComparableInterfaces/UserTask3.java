package ComporatorAndComparableInterfaces;

import java.util.Comparator;
import java.util.TreeSet;

public class  UserTask3 implements Comparable<UserTask3>{
    public String Name;
    public Integer Phone;

    public UserTask3(String name, Integer phone) {
        Name = name;
        Phone = phone;
    }

    public String getName() {
        return Name;
    }

    public Integer getPhone() {
        return Phone;
    }
    @Override
    public int compareTo(UserTask3 other){
        return this.Name.compareTo(other.getName());
    }
    public static void main(String[] args){
        Comparator<UserTask3> byphone = Comparator.comparing(UserTask3::getPhone);
        TreeSet<UserTask3> treeSet= new TreeSet<>(byphone);
        treeSet.add(new UserTask3("Muhammad Ali",+998-99-561-10-60));
        treeSet.add(new UserTask3("Muhammad Yunus",+998-90-123-45-67));
        treeSet.add(new UserTask3("Umar",+998-91-321-54-76));
        for (UserTask3 user : treeSet) {
            System.out.println(user.getName()+" "+user.getPhone());
        }
        treeSet = new TreeSet<>(byphone);
        treeSet.addAll(treeSet);
        for (UserTask3 user:treeSet) {
            System.out.println(user.getName()+" "+user.getPhone());
        }
    }
}
