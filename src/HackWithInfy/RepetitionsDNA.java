package HackWithInfy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepetitionsDNA {
    public static int dna(String s) {
        int maxCount = 1;
        int currentCount = 1;

        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 1;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(dna(s));
    }
}
