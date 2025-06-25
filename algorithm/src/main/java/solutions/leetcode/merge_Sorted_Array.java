package solutions.leetcode;

import java.util.Arrays;

public class merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(nums1[i] > nums2[j]){
                    var temp = nums1[i];
                    nums1[i] = nums2[j];
                    nums2[j] = temp;
                    Arrays.sort(nums2);
                }
                else{
                    break;
                }
            }
        }
        int index = 0;
        for(int i = m; i < m+n; i++){
            nums1[i] = nums2[index];
            index++;
        }
    }
}
