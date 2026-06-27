package TCSNQT;

import java.util.Scanner;

public class StudentIdFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ids = new int[n];
        int[] scores = new int[n];

        //student IDs
        for(int i = 0; i < n; i++) {
            ids[i] = sc.nextInt();
        }

        //Scores
        for(int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int k = sc.nextInt();

        int count = 0;
        int lastId = -1;

        for(int i = 0; i < n; i++) {
            if(scores[i] == x) {
                count++;
                lastId = ids[i];
            }
        }

        if(count >= k) {
            System.out.println(lastId);
        } else {
            System.out.println(-1);
        }
    }
}
