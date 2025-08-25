package solutions.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class find_The_Difference {
    public static char findTheDifference(String s, String t) {
        var sArr = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        var tArr = t.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        for (int i = 0; i < tArr.size(); i++) {
            if (sArr.contains(tArr.get(i))) {
                sArr.remove(tArr.get(i));
            }
            else{
                return  t.charAt(i);
            }
        }
        return t.charAt(0);
    }
}
