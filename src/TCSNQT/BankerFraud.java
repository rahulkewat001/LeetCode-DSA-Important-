package TCSNQT;

import java.util.Scanner;

public class BankerFraud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] sender = new String[n];
        String[] receiver = new String[n];
        int[] amount = new int[n];
        int[] time = new int[n];

        for(int i = 0; i < n; i++) {
            sender[i] = sc.next();
            receiver[i] = sc.next();
            amount[i] = sc.nextInt();
            time[i] = sc.nextInt();
        }

        for(int i = 0; i < n-1; i++) {
            for(int j = i + 1; j < n; j++) {
                if(sender[i].equals(sender[j]) &&
                receiver[i].equals(receiver[j]) &&
                amount[i] == amount[j] &&
                Math.abs(time[i] - time[j]) <= 60) {
                    System.out.println(sender[i] + " " + receiver[i] + " " + amount[i] + " " + time[i]);
                    System.out.println(sender[j] + " " + receiver[j] + " " + amount[j] + " " + time[j]);
                }
            }
        }



    }
}
