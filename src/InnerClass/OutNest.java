package InnerClass;

public class OutNest {
    int x = 10;
    int y = 20;

    private static int a = 30;

    public class Nest {
        void m1() {
            System.out.println("x is " + x);
            System.out.println("a is " + a);
        }
    }

    public static void main(String[] args) {
        OutNest.Nest nest = new OutNest().new Nest();
        nest.m1();
    }
}
