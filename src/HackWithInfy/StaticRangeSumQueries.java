package HackWithInfy;

import java.util.Scanner;

public class StaticRangeSumQueries {
    public static long[] range(long[] arr) {
        long[] prefix = new long[arr.length];

        // build prefix sum
        for(int i = 0; i < arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        return prefix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        long[] arr = new long[n+1];

        for(int i = 1; i <= n; i++) {
            arr[i] = sc.nextLong();
        }

        long[] prefix = range(arr);

        while( q > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            long ans = prefix[r] - prefix[l-1];
            System.out.println(ans);
        }
    }
}
