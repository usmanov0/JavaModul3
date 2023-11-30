package Maps.Hash_maps;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lnk = new LinkedHashMap<>();
        lnk.put(3,"Najot Ta'lim");
        lnk.put(1,"PDP Academy");
        lnk.put(2,"Astrum IT Academy");
        lnk.put(null,null);
        //lnk.remove(null);
        //lnk.replace(1,null);
        for (Map.Entry m:lnk.entrySet()) {
            System.out.println(m.getKey() + " = " + m.getValue()+";");
        }
    }
}
