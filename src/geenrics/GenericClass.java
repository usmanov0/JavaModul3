package geenrics;

import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public class GenericClass<E> {
    Object [] elementdata;
    public GenericClass(int capacity){
        this.elementdata = new Object[capacity];
    }
    public GenericClass(){
        this(4);
    }
    public boolean set(int index, Object  element){
        Objects.checkIndex(index,elementdata.length);
        elementdata[index] = element;
        return true;
    }
    public E get(int index){
        Objects.checkIndex(index,elementdata.length);
        return (E)elementdata[index];
    }
    @Override
    public String toString() {
        return  Arrays.toString(elementdata);
    }
}
class Student{
    String studentID;
    String studentfullname;

    public Student(String studentID, String studentfullname) {
        this.studentID = studentID;
        this.studentfullname = studentfullname;
    }
}
class GenericClassTest{
    public static void main(String[] args) {
        GenericClass<String> genericClass = new GenericClass<String>();
        genericClass.set(0,"Java");
        genericClass.set(1,"C#");
        genericClass.set(2,"Golang");
        genericClass.set(3,"Python");
        System.out.println(genericClass);
        System.out.println(genericClass.get(1));

        GenericClass<Student> student = new GenericClass<Student>(5);
        student.set(0,new Student(UUID.randomUUID().toString(),"Usmonov Aziz"));
        student.set(1,new Student(UUID.randomUUID().toString(), "Rahimov Rustamxon"));
        student.set(2,new Student(UUID.randomUUID().toString(), "Ismoilov Fayoz"));
        student.set(3,new Student(UUID.randomUUID().toString(), "Shavkat Mirziyoyev"));
        student.set(4,new Student(UUID.randomUUID().toString(),"Abdulla Oripov"));

    }
}
