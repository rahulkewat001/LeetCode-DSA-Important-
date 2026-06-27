package HackWithInfy;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class SlidingWindowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Queue<Long> window = new ArrayDeque<>();

        long current = x;
        long sum = 0;
        long xor = 0;

        for(int i = 1; i <= n; i++) {
            if(i > 1) {
                current = (a * current + b) % c;
            }
            window.add(current);
            sum += current;

            if(window.size() > k) {
                sum -= window.poll();
            }

            if(window.size() == k) {
                xor ^= sum;
            }
        }
        System.out.println(xor);
    }
}
