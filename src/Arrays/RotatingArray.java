package Arrays;

import java.util.Arrays;

public class RotatingArray {
    public static void rotate(int[] num, int k) {
        k = k % num.length;
        reverse(num, 0, num.length - 1);
        reverse(num, 0, k - 1);
        reverse(num, k, num.length - 1);

    }

    public static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7};
        int k =  3;
        rotate(num, k);
        System.out.println(Arrays.toString(num));
    }
}
