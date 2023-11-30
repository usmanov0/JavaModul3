package Maps.Hash_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hasmmapss {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        //Map<Integer,String> map = new HashMap<>();
        hashMap.put(1,120);
        hashMap.put(2,240);
        hashMap.put(null,null);
//        for (Map.Entry hsh: hashMap.entrySet()) {
//            System.out.println(hsh.getKey() + " = " + hsh.getValue());
//        }
        hashMap.forEach((k,v)->{
            System.out.println(k+" "+v);
     });
//        Set keySet= hashMap.keySet();   for print keys;
//        keySet.forEach(System.out::println);
    }
}
