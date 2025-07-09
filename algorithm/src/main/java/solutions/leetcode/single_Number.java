package solutions.leetcode;

public class single_Number {
    public static int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        outer:
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i == j) continue;
                if (nums[i] == nums[j]) {
                    continue outer;
                }
            }
            return nums[i];
        }
        return 0;
    }
}
