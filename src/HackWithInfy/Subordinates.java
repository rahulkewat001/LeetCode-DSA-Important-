package HackWithInfy;

import java.util.ArrayList;
import java.util.Scanner;

public class Subordinates {

    static ArrayList<Integer>[] tree;
    static int[] sub;
    public static void dfs(int node) {
        for(int child : tree[node]) {
            dfs(child);
            sub[node] += sub[child] + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i ++) {
            arr[i] = sc.nextInt();
        }
    }
}
