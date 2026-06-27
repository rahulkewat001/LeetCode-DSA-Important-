package TCSNQT;

import java.util.Scanner;

public class TribonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0) {
            System.out.println(0);
            return;
        }
        if(n == 1 || n == 2) {
            System.out.println(1);
            return;
        }

        int a = 0, b = 1, c = 1;
        for(int i = 3; i <= n; i++) {
            int d = a + b + c;
            a = b;
            b = c;
            c = d;

        }
        System.out.println(c);;
    }
}
