package solutions.leetcode;

import java.util.List;
import java.util.stream.Collectors;

public class longest_Palindrome {
    public int longestPalindrome(String s) { //abccccdd -->dccaccd

        if (s.length() == 1) return 1;
        List<Character> chars = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        int count = 0;
        for (int i = 0; i < chars.size(); i++)
        {
            for (int f = i+1; f < chars.size(); f++)
            {
                if(chars.get(i) == chars.get(f))
                {
                    count++;
                    chars.remove(chars.get(i));
                    chars.remove(chars.get(f-1));
                    i--;
                    break;
                }
                else
                {
                    continue;
                }
            }
        }

        if(!chars.isEmpty())
        {
            return count * 2 + 1;
        }
        if(count >= 1)
        {
            return s.length();
        }
        return 0;
    }
}
