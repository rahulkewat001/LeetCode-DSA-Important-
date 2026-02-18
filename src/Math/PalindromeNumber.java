package Math;

public class PalindromeNumber {

    public static boolean palindrome(int x) {
        if(x < 0) {
            return false;
        }

        int original = x;
        int reverse = 0;
        while(x != 0) {
            int digit = x % 10;
            x = x / 10;
            reverse = reverse * 10 + digit;
        }
        return original == reverse;
    }

    public static void main(String[] args) {
        int x = 121;
        palindrome(x);
        System.out.println(palindrome(x));
    }
}
