package TCSNQT;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int zeroes = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                swap(arr, i, zeroes);
                zeroes++;
            }
            System.out.print(arr[i] + " ");
        }

    }
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
