package TCSNQT;

import java.util.Scanner;

public class SweetSeventeen {
    public static int convert(String s) {
        int result = 0;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int digit;

            if(Character.isDigit(ch)) {
                digit = ch - '0';
            } else {
                digit = ch - 'A' + 10;
            }

            result = result * 17 + digit;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(convert(s));
    }
}
