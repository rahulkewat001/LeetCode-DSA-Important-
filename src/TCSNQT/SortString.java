package TCSNQT;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char[] ch = s.toCharArray();

        Arrays.sort(ch);
        System.out.println(new String(ch));
    }
}
