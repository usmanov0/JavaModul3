package Exeptionss;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class CheckedAndUncheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Welcome to reader");
        readFile();
        // chacked Exception --> compile time Exception;
        // unchecked Exception --> Runtime Exception;
    }
    private static void readFile() throws FileNotFoundException {
        try {
            InputStream inputStream = new FileInputStream("file.txt");
        }
        catch (FileNotFoundException e){

        }
    }
    private static void uncheck(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a/b);
    }
}
