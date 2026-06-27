package Arrays;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int original = n;
        int digits = String.valueOf(n).length();

        int sum = 0;
        while(n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }

        if(original == sum) System.out.println("Yes");
        else System.out.println("No");
    }
}
