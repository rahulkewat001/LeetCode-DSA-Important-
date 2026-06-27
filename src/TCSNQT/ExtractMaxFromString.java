package TCSNQT;

import java.util.Scanner;

public class ExtractMaxFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int max = -1;
        int num = 0;
        for(char ch : s.toCharArray()) {
            if(Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else {
                max = Math.max(max, num);
                num = 0;
            }
        }
        max = Math.max(max, num);
        System.out.println(max);
    }
}
