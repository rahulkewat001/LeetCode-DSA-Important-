package TCSNQT;

import java.util.Scanner;

public class FirstAndLastOccurrence {

    public static int firstOccurrence(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int ans = 0;
        while(left < right) {
            int mid = left + (right - left) / 2;

            if(arr[mid] == x) {
                ans = mid;
                right = mid - 1;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static int lastOccurrence(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int ans = 0;
        while(left < right) {
            int mid = left + (right - left) / 2;

            if(arr[mid] == x) {
                ans = mid;
                left = mid + 1;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        int first = firstOccurrence(arr, x);
        int last = lastOccurrence(arr, x);

        if(first == -1) {
            System.out.println(0);
        } else {
            int freq = last - first;
            System.out.println(freq);
        }


    }
}
