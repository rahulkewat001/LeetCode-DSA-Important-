package TCSNQT;

import java.util.Scanner;

public class ArrangeKingsArmy {
    // the arrangement must start with soldier 1
    //the arrangement must end with soldier 'end'
    //no two adjacent soldiers can have the same number
    //you can use any soldier number from 1 to R multiple times

    // return a single integer- no. of valid arrangements

    static int arrange(int N, int R, int end) {
        return countWays(N, R, end, 1, 1);
    }

    static int countWays(int N, int R, int end, int pos, int prev) {

        //base case
        if(pos == N) {
            if(prev == end) return 1;

            return 0;
        }

        int count = 0;

        //Try every soldier
        for(int soldier = 1; soldier <= R; soldier++) {

            // adjacent soldiers can't be same
            if(soldier != prev) {
                count += countWays(N, R, end, pos + 1, soldier);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();
        int end = sc.nextInt();

        System.out.println(arrange(N, R, end));
    }
}
