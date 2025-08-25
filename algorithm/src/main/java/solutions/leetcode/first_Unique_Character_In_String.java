package solutions.leetcode;

import java.util.HashMap;

public class first_Unique_Character_In_String {
    public int firstUniqChar(String s) {
        var dict = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            dict.put(s.charAt(i), dict.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (dict.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
