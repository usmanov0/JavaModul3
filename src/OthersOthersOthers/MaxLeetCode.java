package OthersOthersOthers;

import java.util.Arrays;

public class MaxLeetCode {
    public static void main(String[] args) {
        int a [] = {4000,3000,1000,2000};
        int avg = 0;
        Arrays.sort(a);
        for(int i = 1; i < a.length-1; i++){
            avg+=a[i];
        }

        System.out.println(avg/(a.length/2));
    }
}
