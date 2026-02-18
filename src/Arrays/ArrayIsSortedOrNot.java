package Arrays;

public class ArrayIsSortedOrNot {

    public static boolean check(int[] arr) {
        if(arr.length == 0) {
            return false;
        }

        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i; j < arr.length; j++) {
                if(arr[i] > arr[i+1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        System.out.println(check(arr));
    }
}
