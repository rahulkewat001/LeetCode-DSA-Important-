package HackWithInfy;


import java.util.Arrays;

// slot 1 3rd question was like
//given a permutation of N size
//u need to select the subsequence of size K which has the maximum sum of local maxima elements
//
//ex : N = 6, K = 3 A = [7,1,2,3,4,5}
//output : 12 as the most optimal subseq of size 3 is 7,1,5 with local maximum elements sum 12 (7 + 5)
public class q2 {
    public int maxLocalMaxSum(int[] A, int k) {
        Arrays.sort(A);

        int peaks = (k + 1) / 2;

        int sum = 0;

        for(int i = 0; i < peaks; i++) {
            sum += A[A.length - 1 - i];
        }
        return sum;
    }
}
