package references;

import java.lang.ref.SoftReference;

public class StrongRef {
    public static void main(String[] args) {
        String language = "language";
        SoftReference<String> softReference = new SoftReference<>(language);
        // SoftReference xar qanday xolatda ham garbage collector tozalamaydi;
        language = null;
        System.gc();
        String s = softReference.get();
        System.out.println(s);
    }
}
