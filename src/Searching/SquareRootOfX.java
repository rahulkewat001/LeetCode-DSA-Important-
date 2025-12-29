package Searching;

public class SquareRootOfX {
    public static int mySqrt(int x) {
        int left = 1;
        int right  = x;

        while(left <= right) {
            int mid  = left + (right - left) / 2;
            if((long) mid * mid == x) {
                return mid;
            } else if ((long) mid * mid < x) {
                left = mid + 1;
            } else {
                right = right - 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        int x = 4;
        System.out.println(mySqrt(x));
    }
}
