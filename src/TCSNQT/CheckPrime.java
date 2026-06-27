package TCSNQT;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isprime = true;

        if(n <= 1) isprime = false;

        for(int  i = 2; i < n; i++) {
            if(n % i == 0) isprime = false;
            break;
        }

        System.out.println(isprime ? "Prime" : "Not Prime");
    }
}
