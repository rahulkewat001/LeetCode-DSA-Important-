package HackWithInfy;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSubarraySum {
    public static long max(long[] arr) {
        long maxEnding = arr[0];
        long maxSum = arr[0];

        for(int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(arr[i], maxEnding + arr[i]);
            maxSum = Math.max(maxSum, maxEnding);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // size of array
        long[] arr = new long[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        System.out.println(max(arr));
    }
}
