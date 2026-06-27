package HackWithInfy;

import java.util.Scanner;

public class StringMatching {

    public static int matching(String n, String m) {
        int count = 0;
        for(int i = 0; i < n.length() - m.length(); i++) {
            if(n.substring(i, i+m.length()).equals(m)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String m = sc.nextLine();
        System.out.println(matching(n, m));
    }
}
