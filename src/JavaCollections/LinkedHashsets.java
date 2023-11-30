package JavaCollections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsets {
    public static void main(String[] args) {
        var lnkset =  new LinkedHashSet<>();
        lnkset.add("Java");
        lnkset.add("Python");
        lnkset.add("C++");
        lnkset.add("Scala");
        lnkset.forEach(System.out::println);
        System.out.println("-------------");
        var lnkset1 = new HashSet<String>();
        lnkset1.add("Java");
        lnkset1.add("Python");
        lnkset1.add("C++");
        lnkset1.add("Scala");
        lnkset1.forEach(System.out::println);
    }
}
