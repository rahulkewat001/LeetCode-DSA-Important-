package Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) {
            return -1;
        }

        int count = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 4};
        System.out.println("No. of unique ele: " + removeDuplicates(nums));
    }
}
