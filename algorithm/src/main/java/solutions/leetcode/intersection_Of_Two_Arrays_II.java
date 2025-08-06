package solutions.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class intersection_Of_Two_Arrays_II {
    public int[] intersect(int[] nums1, int[] nums2) {
        var resp = new ArrayList<Integer>();
        var list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        for (int i = 0; i < nums1.length; i++){
            for(int j = 0; j < list2.size(); j++){
                if(nums1[i] == list2.get(j)){
                    resp.add(nums1[i]);
                    list2.remove(j);
                    break;
                }
            }
        }
        return resp.stream().mapToInt(Integer::intValue).toArray();
    }
}
