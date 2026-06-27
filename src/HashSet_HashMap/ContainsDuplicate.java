package HashSet_HashMap;

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean duplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            if(set.contains(num)) {
                return false;
            }
            set.add(num);
        }
        return false;
    }
}
