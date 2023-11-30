package ComporatorAndComparableInterfaces;

import java.util.Arrays;

public class StudentSort {
    public static void main(String[] args) {
        Student students1 = new Student("Javohir", "Botirov");
        Student students2 = new Student("Akbar", "Akbarov");
        Student [] students = {students1,students2};
        Arrays.sort(students);
        for (Student student:students) {
            System.out.println(student);
        }
    }
}
