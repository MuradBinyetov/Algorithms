package solutions.leetcode;

import java.util.HashSet;
import java.util.Set;

public class reverse_Vowels_Of_String {
    public static String reverseVowels(String s) {
        var set = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        StringBuilder sb = new StringBuilder(s);
        int j = s.length() - 1;

        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(sb.charAt(i))) {
                continue;
            }

            while (j > i && !set.contains(sb.charAt(j))) {
                j--;
            }

            if (j > i) {
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                j--;
            }
        }

        return sb.toString();
    }
}
