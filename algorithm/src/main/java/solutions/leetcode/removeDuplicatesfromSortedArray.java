package solutions.leetcode;

import java.util.ArrayList;

public class removeDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) { //[1,1,2,2]
        //bu varianti leetcode qebul etmir bilmedim niye :)
        var list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] != nums[i+1]){
                list.add(nums[i]);
            }
        }
        list.add(nums[nums.length-1]);
        return list.size();



        //bu variant qebul edilir
        // if (nums.length == 0 || nums.length == 1)
        //            return nums.length;
        //        int index = 0;
        //        for (int i = 1; i < nums.length; i++)
        //        {
        //            if (nums[i - 1] != nums[i])
        //                nums[++index] = nums[i];
        //        }
        //        return index + 1;
    }
}
