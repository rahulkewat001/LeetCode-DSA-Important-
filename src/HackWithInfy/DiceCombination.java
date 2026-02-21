package HackWithInfy;

import java.util.Scanner;

public class DiceCombination {

    static final int MOD = 1000000007;
    public static long dice(int n) {
        long[] dp = new long[n+1];
        dp[0] = 1;

        for(int i = 1; i <= n; i++) {
            for(int dice = 1; dice <= 6; dice++) {
                if(i - dice >= 0) {
                    dp[i] = (dp[i] + dp[i - dice]) % MOD;
                }
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(dice(n));

    }
}
