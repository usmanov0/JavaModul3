package ComporatorAndComparableInterfaces;

public class Student implements Comparable<Student>{
    public String name;
    public String phone;

    public Student(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
