package Copy;

public class Student implements Cloneable{
    String fullname;
    int age;

    public Student(String name, int age) {
        this.fullname = name;
        this.age = age;
    }
    public Student(Student student){
        this.fullname = student.fullname;
        this.age = student.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + fullname + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    /*Agarda Istalgan classdan clone olayotkan paytingizda  shu classning barcha fieldlari
    primitive tiplar yoki immutable(String) classraning o'zidan tashkil topgan bo'lsa shu yerda
    clone methodni @Override qilib qo'yishingiz Xam Shallow Copy Xam Deep Copy bo'ladi xarqi bo'lmaydi;;
    *Agarda mutable field bo'ladigan bo'lsa u xolda Shallow Copy bilan Deep Copy farq qiladi bir biridan;
     */
}
