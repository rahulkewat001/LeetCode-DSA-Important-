package TCSNQT;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), res);
        return res;
    }

    public void backtrack(int[] nums, List<Integer> temp, List<List<Integer>> res) {
        if(temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i = 0; i < nums.length; i++) {

            //check duplicate
            if(temp.contains(nums[i])) {
                continue;
            }

            //choose
            temp.add(nums[i]);

            //explore
            backtrack(nums, temp, res);

            //backtrack
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        Permutations obj = new Permutations();

        int[] nums = {1, 2, 3};

        List<List<Integer>> ans = obj.permute(nums);

        System.out.println(ans);
    }
}
