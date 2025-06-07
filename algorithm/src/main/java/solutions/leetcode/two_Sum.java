package solutions.leetcode;

public class two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        var result = new int[2];

        if(nums.length==2){
            if(nums[0]+nums[1]==target){
                result[0] = 0;
                result[1] = 1;
            }
        }
        else{
            for(var i =0;i<nums.length;i++){
                for(int j = i+1;j<nums.length;j++){
                    if(nums[i]+nums[j] == target){
                        result[0] = i;
                        result[1] = j;
                        break;
                    }
                }
            }
        }


        return result;
    }
}
