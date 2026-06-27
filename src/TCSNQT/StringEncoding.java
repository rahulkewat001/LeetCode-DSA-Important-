package TCSNQT;

import java.util.Scanner;

public class StringEncoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(i % 2 == 0) {
                ch += 2;
            } else {
                ch -= 1;
            }
            sb.append(ch);
        }
        System.out.println(sb);

    }

}
