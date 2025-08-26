package solutions.leetcode;

import java.util.Stack;
import java.util.TreeMap;

public class third_Maximum_Number {
    public static int thirdMax(int[] nums) {
        TreeMap<Integer, Integer> sortedMap = new TreeMap<>();

        for (int i = 0; i < nums.length; i++)
        {
            if (!sortedMap.containsKey(nums[i]))
            {
                sortedMap.put(nums[i],i);
            }
        }

        Stack<Integer> stack = new Stack<Integer>();
        for (Integer key : sortedMap.keySet()) {
            stack.push(key);
        }

        if (stack.size() >= 3)
        {
            stack.pop();
            stack.pop();
            return stack.pop();
        }
        else
        {
            return stack.pop();
        }

    }
}
