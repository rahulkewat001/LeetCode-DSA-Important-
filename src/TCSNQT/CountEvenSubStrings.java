package TCSNQT;

import java.util.Scanner;

public class CountEvenSubStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        long count = 0;

        for(int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';

            if(digit % 2 == 0) {
                count += (long) (i + 1);
            }
        }

        System.out.println(count);
    }
}
