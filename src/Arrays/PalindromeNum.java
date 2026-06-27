package Arrays;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int dup = n;
        int rev = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            rev = rev * 10 + lastDigit;
        }

        if(dup == rev) {
            System.out.println("True");;
        } else {
            System.out.println("False");
        }

    }
}
