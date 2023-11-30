package Exeptionss;
import java.util.Scanner;
public class NoFoundnumberException {
    public static void main(String[] args) {
        int[] array = new int[11];
        Scanner input = new Scanner(System.in);
        for (int i = 1; i < array.length; i++) {
            System.out.print("[" + i + "] element qiymatini kiriting: ");
            int number = input.nextInt();
            if (number < 1 || number > 10) {
                throw new NoFoundNumberException("Kiritilgan son 1 dan kichik yoki 10 dan katta");
            }
            array[i] = number;
        }
        System.out.println("Massivdagi elementlar:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "]: " + array[i]);
        }
    }
}

class NoFoundNumberException extends RuntimeException {
    public NoFoundNumberException(String message) {
        super(message);
    }
}

