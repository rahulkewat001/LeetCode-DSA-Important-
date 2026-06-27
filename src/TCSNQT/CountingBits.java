package TCSNQT;

import java.util.Arrays;
import java.util.Scanner;

public class CountingBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n+1];

        for(int i = 0; i < arr.length; i++) {
            int num = i;
            int binary = 0;

            while(num > 0) {
                binary += num % 2;
                num /= 2;
            }
            arr[i] = binary;
        }
        System.out.println(Arrays.toString(arr));


    }
}
