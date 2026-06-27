package TCSNQT;

import java.util.Scanner;

public class ReverseString {

    static String rev(String s) {
        String[] words = s.split(" +");
        StringBuilder sb = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(rev(s));
    }
}
