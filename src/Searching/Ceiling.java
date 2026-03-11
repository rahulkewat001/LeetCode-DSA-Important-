package Searching;

public class Ceiling {
    static int ceiling(int[] arr, int target) { // return the index of smallest no >= target
        if(target > arr[arr.length - 1]) {
            return -1;
        }

        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int m = s + (e - s) / 2;

            if(target < arr[m]) {
                e = m - 1;
            } else if (target > arr[m]) {
                s = m + 1;
            } else {
                return m;
            }
        }
        return s;

    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 14;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }
}
