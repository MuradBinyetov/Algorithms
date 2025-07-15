package solutions.leetcode;

import java.util.HashMap;
import java.util.Map;

public class majority_Element {
    public static int majorityElement(int[] nums) {
        var map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++){
            var count =1;
            if(!map.containsKey(nums[i])){
                for(int j = i+1; j < nums.length; j++){
                    if(nums[i] == nums[j]){
                        count++;
                    }
                }
                map.put(nums[i], count);
            }
        }

        int maxKey = 0;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
}
