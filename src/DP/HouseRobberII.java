package DP;

public class HouseRobberII {
    public static int rob(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }

        return Math.max(
                linearRob(nums, 0, nums.length - 2),
                linearRob(nums, 1, nums.length - 1)
        );


    }

    public static int linearRob(int[] nums, int start, int end) {
        int prev1 = 0;
        int prev2 = 0;

        for(int i = start; i <= end; i++) {
            int pick = nums[i] + prev2;
            int notPick = prev1;

            int curr = Math.max(pick, notPick);

            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(rob(nums));
    }
}
