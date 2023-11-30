package Copy;

public class StudentTest {
    public static void main(String[] args) {
        var student = new Student("Usmonov Aziz",18);
//        var student1 = new Student(student);
//        System.out.println(student);
//        System.out.println(student1);
        try {
            Student student2 = (Student) student.clone();
            System.out.println(student);
            System.out.println(student2);
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
