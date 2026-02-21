package HackWithInfy;

import java.util.Scanner;

public class WeirdAlgo {

    public static void weird(int n) {

        while(n != 1) {
            System.out.print(n + " ");

            if(n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
        }
        System.out.println(1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        weird(n);
    }
}
