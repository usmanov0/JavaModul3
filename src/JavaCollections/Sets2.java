package JavaCollections;

import java.util.HashSet;

public class Sets2 {
    public static void main(String[] args) {
        //List<Integer> list = new ArrayList<>();
        HashSet<Employee> hashSet = new HashSet<>(/*list*/);
        hashSet.add(new Employee("Abdovihid","Java developer",10_000));
        hashSet.add(new Employee("Muhammadkarim",".NET developer",10_000));
        hashSet.add(new Employee("Anvar","Software Engineer",20_000));
        System.out.println(hashSet);
    }
}
class Employee{
    String Name;
    String Ishjoyi;
    Integer salary;

    public Employee(String name, String ishjoyi, Integer salary) {
        Name = name;
        Ishjoyi = ishjoyi;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "JavaCollections.Employee{" +
                "Name='" + Name + '\'' +
                ", Ishjoyi='" + Ishjoyi + '\'' +
                ", salary=" + salary +
                '}' +"\n";

    }
}
