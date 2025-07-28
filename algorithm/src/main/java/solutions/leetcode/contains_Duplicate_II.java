package solutions.leetcode;

import java.util.HashMap;

public class contains_Duplicate_II {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            }
            else{
                var value = map.get(nums[i]);
                var diff = Math.abs(i - value);
                if(diff <= k){
                    return true;
                }
                else{
                    map.put(nums[i], i);
                }
            }
        }
        return false;
    }
}
