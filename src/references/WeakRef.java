package references;

import java.lang.ref.WeakReference;

public class WeakRef {
    public static void main(String[] args) {
        String language = "Java";
        WeakReference<String> weakReference = new WeakReference<>(language);
        // WeakReference istalgan garbage collector siklida jvm uchirib yuborishi mumkin;
        language = null;
        System.gc();
        String s = weakReference.get();
        System.out.println(s);
    }
}
