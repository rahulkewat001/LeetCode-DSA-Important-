package TCSNQT;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDupliFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()) {
            if(!set.contains(ch)) {
                set.add(ch);
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());;
    }
}
