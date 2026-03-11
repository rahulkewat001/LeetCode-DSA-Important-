package Math;

public class PowerOfTwo {
    public static boolean isPower(int n) {
        if(n > 0 && (n & (n-1)) == 0) {
            return true;
        }
        return false;
    }
}
