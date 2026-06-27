package TCSNQT;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class FactorialsOfLargeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fact(n);
        ArrayList<Integer> list = new ArrayList<>();
        while(ans != 0) {
            list.add(ans % 10);
            ans /= 10;
        }
        Collections.reverse(list);
        System.out.println(list);
    }

    public static int fact(int n) {
        if(n <= 1) return 1;

        return n * fact(n -1);
    }
}
