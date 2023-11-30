package Exeptionss;
import java.util.Locale;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Integer a = 5;
//        Integer b = 0;
//        try{
//            System.out.println(a/b);
//        }
//        catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }

//        int a = scanner.nextInt();
//        System.out.println(a*2);
//        scanner.close();
        registerUser("JO",123);
    }
    static boolean registerUser(String name, Integer id){
        if (name != null) {
            name = name.toLowerCase();
        }
        return true;
    }
}
