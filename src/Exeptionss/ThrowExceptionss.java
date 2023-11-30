package Exeptionss;
import java.io.IOException;
public class ThrowExceptionss {
    public static void main(String[] args) throws Exception{
        m1(1);
    }
     private static void m1(int a) throws Exception{
        if (a == 1) {
            throw  new Exception("a is 1 which is not acceptable");
        }
    }
    private static void m2(){
    }
    private static void m3(){
    }
}
