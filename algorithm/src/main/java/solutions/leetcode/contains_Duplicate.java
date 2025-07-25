package solutions.leetcode;

import java.util.HashMap;

public class contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i <= nums.length - 1; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
            else{
                return true;
            }
        }
        return false;
    }
}
