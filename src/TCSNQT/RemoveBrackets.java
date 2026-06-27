package TCSNQT;

import java.util.Scanner;

public class RemoveBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()) {
            if(ch != '(' && ch != ')') {
                sb.append(ch);
            }
        }
        System.out.println(sb);

    }


}
