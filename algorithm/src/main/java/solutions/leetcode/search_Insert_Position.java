package solutions.leetcode;

public class search_Insert_Position {
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }
}
