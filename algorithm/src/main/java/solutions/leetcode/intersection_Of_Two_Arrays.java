package solutions.leetcode;

import java.util.ArrayList;

public class intersection_Of_Two_Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        var resp = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++){
            if(resp.contains(nums1[i])){
                continue;
            }else{
                for(int j = 0; j < nums2.length; j++){
                    if(nums1[i] == nums2[j]){
                        resp.add(nums1[i]);
                        break;
                    }
                }
            }
        }

        return  resp.stream().mapToInt(Integer::intValue).toArray();
    }
}
