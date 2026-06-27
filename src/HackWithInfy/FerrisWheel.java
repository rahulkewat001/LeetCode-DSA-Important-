package HackWithInfy;

import java.util.Arrays;
import java.util.Scanner;

public class FerrisWheel {
    public static int ferris(int[] childs, int x) {
        Arrays.sort(childs);

        int i = 0;
        int j = childs.length - 1;
        int count = 0;

        while( i <= j) {
            if(childs[i] + childs[j] <= x) {
                i++;
                j--;
            } else {
                j--;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] childs = new int[n];
        for(int i = 0; i < n; i++) {
            childs[i] = sc.nextInt();
        }
        System.out.println(ferris(childs, x));
    }
}
