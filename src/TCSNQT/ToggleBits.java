package TCSNQT;

import java.util.Scanner;

public class ToggleBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int bits = 0;
        int temp = n;
        while(temp > 0) {
            bits++;
            temp /= 2;
        }

        int mask = (1 << bits) - 1;
        System.out.println(n ^ mask);
    }
}
