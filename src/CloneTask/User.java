package CloneTask;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class User implements Cloneable{
    String name;
    String phone;
    Role role;
    public User(String name, String phone,Role role) {
        this.name = name;
        this.phone = phone;
        this.role = role;
    }
    enum Role{
        FATHER,
        MOTHER,
        CHILD
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", role=" + role +
                '}';
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        return (User)super.clone();
    }


    public static void main(String[] args) {
        List<User> shallowcopy = new ArrayList<>();
        List<User> deepcopy = new ArrayList<>();
        User user = new User("Muhammad Ali", "+998-90-123-45-67", Role.FATHER);
        User user1 = new User("Fotima", "+998-91-111-22-33", Role.MOTHER);
        User user2 = new User("Umar", "+998-90-122-21-12", Role.CHILD);
        shallowcopy.add(user);
        shallowcopy.add(user1);
        shallowcopy.add(user2);

        try {
            deepcopy.add(user.clone());
            deepcopy.add(user1.clone());
            deepcopy.add(user2.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        ListIterator<User> iterator1 = shallowcopy.listIterator();
        System.out.println("Shallow Copy");
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println("--------");
        while (iterator1.hasPrevious()){
            System.out.println(iterator1.previous());
        }
        ListIterator<User> iterator2 = deepcopy.listIterator();
        System.out.println("Deep Copy");
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
        System.out.println("-------");
        while (iterator2.hasPrevious()){
            System.out.println(iterator2.previous());
        }
    }
}

