package String;

import java.util.Scanner;

public class LargestNumberAfterMutatingSubstring {
    public static String maximumNumber(String num, int[] change) {
        char[] arr = num.toCharArray();
        boolean started = false;
        for(int i = 0; i < arr.length; i++) {
            int digit = arr[i] - '0';
            if(change[digit] > digit && started) {
                arr[i] = (char)(change[digit] - '0');
            } else if (change[digit] == digit && started) {
                arr[i] = (char) (change[digit] - '0');
            } else if (change[digit] < digit && started) {
                break;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int n = sc.nextInt();
        int[] change = new int[10];
        for(int i = 0; i < n; i++) {
            change[i] = sc.nextInt();
        }

        System.out.println(maximumNumber(num, change));
    }
}
