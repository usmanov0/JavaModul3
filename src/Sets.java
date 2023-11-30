import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {
        HashSet<User> set = new HashSet<>(10,2);
//        Integer a = 10;
//        Integer b = 20;
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
//        set.add(a);
//        set.add(b);
//        set.add(new User("Azik","Usmonov Aziz"));
//        set.add(new User("Aziz","usmonov Aziz"));
//        System.out.println(set);
    }
}
class User{
    String username;
    String fullname;

    public User(String username, String fullname) {
        this.username = username;
        this.fullname = fullname;
    }

    @Override
    public int hashCode() {
        username = fullname;
        return username.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        username = fullname;
        User obj1 = (User) obj;
        return username.equals(obj1.username);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}
