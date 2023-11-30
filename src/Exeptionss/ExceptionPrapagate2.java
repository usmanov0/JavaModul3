package Exeptionss;

import java.io.FileNotFoundException;

public class ExceptionPrapagate2 {
    public static void m5() throws FileNotFoundException {
        throw new FileNotFoundException("Checking Exception Prapagation");
    }
}
