package TCSNQT;

import java.util.Scanner;

public class MaxSumOfElements {
    // an array of integers of size of n
    // an integer maxSum(maximum allowed sum)
    // find the max possible sum of elements from the array such
    // that the sum is less than or equal to maxSum.
    // return the max sum <= maxSum

    static int maxsum(int[] arr, int maxSum) {
        boolean[] dp = new boolean[maxSum + 1];
        dp[0] = true;

        //process every element
        for(int num : arr) {

            // traverse backwards
            for(int s = maxSum; s >= num; s--) {
                if(dp[s-num]) {
                    dp[s] = true;
                }
            }
        }

        //find largest possible sum
        for(int s = maxSum; s >= 0; s--) {
            if(dp[s]) {
                return s;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxSum = sc.nextInt();

        System.out.println(maxsum(arr, maxSum));
    }
}
