package solutions.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class remove_Element {
    public static int removeElement(int[] nums, int val) { // nums = [3,2,2,3], val = 3 ---> [2,2,_,_]
        var list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        if (!list.contains(val))
        {
            return list.size();
        }
        for (int i = 0; i < list.size(); i++)
        {
            if(list.get(i) == val)
            {
                list.remove(i);
            }
        }
        return list.size();
    }
}
