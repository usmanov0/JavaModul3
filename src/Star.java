import java.util.Scanner;
public class Star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int  k = 0;
        for (int i = 1; i < rows + 1; i++){
            for (int j = 1; j < (rows-i)+1; j++){
                System.out.println("end =  ");
            }
            while (k!=2*i-1){
                System.out.print("* ");
                System.out.println("end = ");
                k += 1;
            }
            k = 0;
            System.out.println();
        }
    }
}
