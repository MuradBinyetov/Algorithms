package solutions.leetcode;

import java.util.*;

public class find_All_Numbers_Disappeared_In_Array {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>(); // tekrar reqemler daxil edilib her defe contains-de yoxlamasin deye yazilib.
        for (int num : nums) {
            set.add(num);
        }

        List<Integer> resp = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                resp.add(i);
            }
        }
        return resp;
    }
}
