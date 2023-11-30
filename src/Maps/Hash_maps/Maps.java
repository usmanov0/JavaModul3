package Maps.Hash_maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Object, Object> objectObjectMap = new HashMap<>();
        objectObjectMap.put(1,2);
        objectObjectMap.put(1,3);
        System.out.println(objectObjectMap.get(1));

    }
}
