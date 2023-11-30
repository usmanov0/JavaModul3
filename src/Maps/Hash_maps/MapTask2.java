package Maps.Hash_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class MapTask2 {
    public static void main(String[] args) {
        enum Role {
            GRANDPHA,
            GRANDMA,
            FATHER,
            MOTHER,
            CHILD
        }
        class User{
            String name;
            String phone;
            Role role;
            public User(String name, String phone, Role role) {
                this.name = name;
                this.phone = phone;
                this.role = role;
            }

            @Override
            public String toString() {
                return name + "(" + role + ")";
            }
        }
        Map<Integer,List<User>> house = new HashMap<>();
        house.put(1, Arrays.asList(
                new User("Shavkat","+998-99-5611060",Role.GRANDPHA),
                new User("Lera","+998-91-123-45-67",Role.GRANDMA),
                new User("Ravshan","+998-91-123-45-67",Role.FATHER),
                new User("Nargiza","+998-91-123-45-67",Role.MOTHER),
                new User("Alisher","+998-98-123-45-67",Role.CHILD)
        ));
        for (Map.Entry<Integer,List<User>> entry: house.entrySet()){
            List<User> users = entry.getValue();
            for(User user : users){
                System.out.println(user.toString()+" ");
            }
            System.out.println();
        }
        }
    }


