package Exeptionss;

import java.io.FileNotFoundException;
import java.lang.module.FindException;

public class ExceptionPropogate {
    public static void main(String[] args) throws FileNotFoundException {
        m1();
    }

    private static void m1() throws FileNotFoundException {
        m2();
    }
    private static void m2() throws FileNotFoundException {
        m3();
    }
    private static void m3() throws FileNotFoundException{
        ExceptionPrapagate2.m5();
    }
}

