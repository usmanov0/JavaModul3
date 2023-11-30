package JavaCollections;

import java.util.Scanner;

public class juft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        int arr[] = {1,2,3,4,5,6};
        for (int i = 0; i < arr.length; i+=2) {
            System.out.println(arr[i]+" ");
        }
    }
}
