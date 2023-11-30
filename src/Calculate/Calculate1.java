package Calculate;

import java.util.Scanner;

public class Calculate1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char symbol = getOperation();
        int result = calc(num1, num2, symbol);
        System.out.print("Result = " + result);
    }

    public static int getInt() {
        System.out.print("Enter number: ");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("You made a mistake, try again please");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation() {
        System.out.print("Enter symbol: ");
        char symbol;
        if (scanner.hasNext()) {
            symbol = scanner.next().charAt(0);
        } else {
            System.out.println("You made a mistake, try again!");
            scanner.next();
            symbol = getOperation();
        }
        return symbol;
    }

    public static int calc(int num1, int num2, char symbol) {
        int result;
        switch (symbol) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("You enter incorrect number");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}
