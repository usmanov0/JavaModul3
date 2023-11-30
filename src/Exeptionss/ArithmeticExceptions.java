package Exeptionss;

public class ArithmeticExceptions extends Throwable {
    public static void main(String[] args) {
        boluv(12,0);
        System.out.println("End");
    }
    public static void boluv(int a, int b){
        try{
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
