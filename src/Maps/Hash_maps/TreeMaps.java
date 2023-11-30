package Maps.Hash_maps;

import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> tr = new TreeMap<>();
        tr.put(5,5);
        tr.put(4,5);
        tr.put(1,10);
        tr.put(2,2);
        tr.put(3,3);
        //System.out.println(tr.firstKey()+tr.lastKey());
        //tr.put(null,null); keyga null qiymat mumkin emas;
        //elementlarni olish, olish yoki elementlarni o'chirish juda ham tez log(n) TreeMap da;
        // TreeMap red-blacktree malumot tuzilmasidan foydalanadi va biz bergan keylarni sort qiladi;
        for (Map.Entry m:tr.entrySet()) {
            System.out.println(m.getKey()+" = "+m.getValue()+";");
        }
        System.out.println("With ForEach:");
        tr.forEach((k,v)-> System.out.println(k+"="+v));

        TreeMap<Student,String> trem = new TreeMap<>();
        trem.put(new Student(12,"Rashid"),"Halikov");
        trem.put(new Student(5,"Raxmon"),"Halikov");
        trem.put(new Student(1,"Raxmo"),"Halikov");
        trem.forEach((k,v)-> System.out.println(k+"="+v));
    }
}
class

Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.age,student.age);
    }
}
