package HackWithInfy;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNum {

    public static int missing(int[] arr, int n) {
        int xorAll = 0;
        int xorArr = 0;

        for(int i = 1; i <= n; i++) {
            xorAll ^= i;
        }

        for(int num : arr) {
            xorArr ^= num;
        }
        return xorAll ^ xorArr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n - 1];
        for(int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(missing(arr, n));
    }
}
