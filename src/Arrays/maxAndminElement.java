package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class maxAndminElement {
    public static ArrayList<Integer> findMinMax(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < max) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        res.add(min);
        res.add(max);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 1, 9};
        System.out.println(findMinMax(arr));
    }
}
