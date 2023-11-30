package LegacyCollections;

import java.util.Hashtable;

public class HashTables<I extends Number, S> {
    /*Hashtable synchronized collection hisoblanadi uni HashMap dan farqi Hashtable synchronized yani bir nechta
    potoklar bilan ishlay olmaydi birinchi potok kiradi shu potok chiqib ketmaguncha ikkinchi potok kirmaydi*/
    /*Hashtabledan foydalangan yaxshimi yoki HashMapdan? Agarda Proyekt bir nechta potoklar bilan ishlamasa yani Multithread
    bo'lmasa Hashtabledan foydalangan yaxshi*/
    public static void main(String[] args) {
        var hashtable = new Hashtable<Integer,String>();
        hashtable.put(1,"Char");
        hashtable.put(2,"String");
        hashtable.put(3,"Boolean");
        hashtable.put(4,"Integer");
//        System.out.println(hashtable.containsKey(1));
//        System.out.println(hashtable.containsValue("String"));
        hashtable.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
