package references;

import java.lang.ref.SoftReference;

public class Softref {
    public static void main(String[] args) {
        String language = "String";
        SoftReference<String> softReference = new SoftReference<>(language);
        //SoftReference qachonki xotiradan joy kerak bo'lsa jvm ochiradi;
        language = null;
        System.gc();
        String s = softReference.get();
        System.out.println(s);
    }

}
