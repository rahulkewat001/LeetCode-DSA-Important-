package TCSNQT;

import java.util.Scanner;

public class LargestOddNumberinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        for(int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';
            if(digit % 2 != 0) {
                System.out.println(num.substring(0, i+1));
            }
        }
        System.out.println(" ");
    }
}
