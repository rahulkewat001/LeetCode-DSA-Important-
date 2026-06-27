package TCSNQT;

import java.util.Scanner;

public class SumOfNuminString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int sum = 0;
        int num = 0;
        for(char ch : s.toCharArray()) {
            if(Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else {
                sum += num;
                num = 0;
            }
        }
        sum += num;
        System.out.println(sum);
    }
}
