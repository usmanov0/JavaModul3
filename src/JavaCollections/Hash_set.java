package JavaCollections;

import java.util.HashSet;
import java.util.Set;

public class Hash_set { // Default initial capacity(16) in Hashset;
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add(new User("Myke","MykeTyson").toString());
        set.add(new User("Tyson","Myketyson").toString());

    }
}
class User{
    String name;
    String fullname;

    public User(String name, String fullname) {
        this.name = name;
        this.fullname = fullname;
    }
    public int hashCode(){
        return fullname.hashCode();
    }
}
