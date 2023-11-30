package InheritanceRulesForGenericTypes;

public class InheritanceTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();
        employee = manager; //valid

        Pair<Employee> employeePair = new Pair<>(employee);
        Pair<Manager> managerPair = new Pair<>(manager);
        /*employeePair = managerPair; invalid
        Genericlarda hechqachon relationship bo'lmaydi xattoki relation bo'lgan classlardan obyekt olganingizda ham!!!*/
    }
}
class Pair<E>{
    private final E e;

    Pair(E e) {
        this.e = e;
    }
}
