package TCSNQT;

import java.util.HashSet;
import java.util.Scanner;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr) {
            set.contains(num);
        }

        for(int num : arr) {
            if(num == 1) {
                System.out.println(num);
            }
        }
    }
}
