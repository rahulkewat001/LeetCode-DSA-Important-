package HackWithInfy;

import java.util.Scanner;

public class Subarray1 {
    // Given an array of n positive integers,
    // your task is to count the number of subarrays having sum x.
    public static long max(long[] arr, int x) {
        int left = 0;
        long sum = 0;
        long count = 0;

        for(int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while(sum > x) {
                sum -= arr[left];
                left++;
            }

            if(sum == x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // size of array
        int x = sc.nextInt();
        long[] arr = new long[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        System.out.println(max(arr, x));
    }
}
