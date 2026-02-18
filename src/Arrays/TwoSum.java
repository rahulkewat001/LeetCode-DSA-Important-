package Arrays;

import java.util.Arrays;

public class TwoSum {
    static int[] twoSum(int[] arr, int target) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i+1; j <arr.length; j++) {
                if(target == arr[i] + arr[j]) {
                    return new int[]{i, j};
                }
            }

        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 7};
        int target = 11;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
