package Math;

public class ReverseInteger {
    public static int rev(int n) {
        int reverse = 0;
        while(n != 0) {
            int digit = n % 10;
            n = n / 10;

            if(reverse > Integer.MAX_VALUE / 10 || reverse < Integer.MIN_VALUE / 10) {
                return 0;
            }

            reverse = reverse * 10 + digit;
        }
         return reverse;
    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println(rev(n));
    }
}
