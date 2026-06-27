package TCSNQT;

import java.util.Scanner;

public class CountVowelandConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String lowecase = s.toLowerCase();
        int vowels = 0;
        int conso = 0;

        for(int i = 0; i < lowecase.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'e') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') conso++;

        }
        System.out.println("Number of vowels : " + vowels);
        System.out.println("Number of consonenets : " + conso);
    }
}
