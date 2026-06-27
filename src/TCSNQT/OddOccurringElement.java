package TCSNQT;

import java.util.Arrays;
import java.util.Scanner;

public class OddOccurringElement {
    public static int check(int[] nums) {
        int xor = 0;

        for(int num : nums) {
            xor ^= num;
        }
        return xor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(check( nums));
    }
}
