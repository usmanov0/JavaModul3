package geenrics;

import java.security.Provider;

public class VariableBounds<T extends CharSequence> {
    private final T field;

    public VariableBounds(T field) {
        this.field = field;
    }
}
interface CanConnectToDatabase{}
    class Repository implements CanConnectToDatabase{}
    class Service<R extends CanConnectToDatabase>{
        private final R repository;

        Service(R repository) {
            this.repository = repository;
        }
    }

class VariableBoundsTest{
    public static void main(String[] args) {
        var bounds = new VariableBounds<String>("String");
        System.out.println(bounds);
        Repository repository = new Repository();
        var sirvice = new Service<Repository>(new Repository());
        System.out.println(sirvice);
    }
}



