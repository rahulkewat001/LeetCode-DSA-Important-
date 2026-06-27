package HackWithInfy;

import java.util.Arrays;
import java.util.Scanner;

public class Apartments {

    public static int apartments(int[] applicants, int[] apartments, int k) {
        Arrays.sort(applicants);
        Arrays.sort(apartments);
        
        int i = 0; 
        int j = 0; 
        int count = 0;
        
        while(i < applicants.length && j < apartments.length) {
            if(Math.abs(applicants[i] - apartments[j]) <= k) {
                count++;
                i++;
                j++;
            } else if (applicants[i] < apartments[j] - k) {
                j++;
            } else {
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] applicants = new int[n];
        int[] apartments = new int[m];
        for(int i = 0; i < n; i++) {
            applicants[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++) {
            apartments[i] = sc.nextInt();
        }


        System.out.println(apartments(applicants, apartments, k));
    }
}
