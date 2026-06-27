package HackWithInfy;

public class q1 {

    public static int countItem(int[] arr, int x, int y) {
        int noSwap = 0;
        int swap = 0;
        for(int i = 0; i < arr.length; i++) {
            // no swap
            if(i % 2 == 0 && arr[i] > x) noSwap++;
            else if (i % 2 != 0 && arr[i] > y) noSwap++;

            //swap case

            if(i % 2 == 0 && arr[i] > y) swap++;
            else if (i % 2 != 0 && arr[i] > x) swap++;
        }
        return Math.max(noSwap, swap);
    }
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 6};
        int x = 3;
        int y = 2;
        System.out.println(countItem(arr, x, y));
    }
}
