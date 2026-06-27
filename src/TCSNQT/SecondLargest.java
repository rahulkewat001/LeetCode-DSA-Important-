package TCSNQT;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int secLarge = arr[arr.length - 1];

        for(int i = arr.length - 2; i >= 0; i--) {
            if(arr[i] != secLarge) {
                System.out.println(arr[i]);;
            }
        }
    }
}
