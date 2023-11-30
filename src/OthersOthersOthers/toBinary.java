package OthersOthersOthers;

import java.util.Scanner;

public class toBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String tobin= "";

        while(number > 0){
            tobin = (number % 2) + tobin;
            number = number / 2;
        }
        System.out.println(tobin);
    }
}
