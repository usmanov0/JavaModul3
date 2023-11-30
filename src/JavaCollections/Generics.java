package JavaCollections;

public class Generics<T> {
    T obj;

    Generics(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }
}
    class Main{
        public static void main(String[] args) {
            Generics<Integer> object = new Generics<Integer>(15);
            System.out.println(object.getObj());
            Generics<String> sobj = new Generics<String>("Hello world");
            System.out.println(sobj.getObj());
        }
}
