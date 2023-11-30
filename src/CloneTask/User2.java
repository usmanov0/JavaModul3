package CloneTask;

import java.util.ArrayList;
import java.util.List;

public class User2 implements Cloneable{
    String name;
    String phone;
    Role role;

    enum Role{
        FATHER,MOTHER,CHILD
    }
    public User2(String name, String phone, Role role) {
        this.name = name;
        this.phone = phone;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User2{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", role=" + role +
                '}';
    }

    @Override
    protected User2 clone() throws CloneNotSupportedException {
        return (User2) super.clone();
    }

    public static void main(String[] args) {

        List<User2> shallowcopy = new ArrayList<>();
        List<User2> deepcopy = new ArrayList<>();

        User2 user1 = new User2("Abduvohid Ergashev", "123-45-67", Role.FATHER);
        User2 user2 = new User2("Zuhra Birbaloyeva", "223-45-67", Role.MOTHER);
        User2 user3 = new User2("Amirbek Arslonov", "321-54-65", Role.CHILD);
        shallowcopy.add(user1);
        shallowcopy.add(user2);
        shallowcopy.add(user3);

        try {
            deepcopy.add(user1.clone());
            deepcopy.add(user2.clone());
            deepcopy.add(user3.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(shallowcopy);
        System.out.println(deepcopy);
    }
}
