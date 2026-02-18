package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class FirstNFibonacci {
    public static void fibo(int n) {
        if(n <= 0) {
            return;
        }

        int a = 0;
        int b = 1;
        for(int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo(n);
    }
}
