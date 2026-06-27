package TCSNQT;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int missing = arr.length * (arr.length + 1) / 2;
        for(int i = 0; i < arr.length; i++) {
            missing -= arr[i];
        }
        System.out.println(missing);
    }
}
