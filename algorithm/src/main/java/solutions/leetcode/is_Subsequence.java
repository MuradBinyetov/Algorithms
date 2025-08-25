package solutions.leetcode;

public class is_Subsequence {
    public boolean isSubsequence(String s, String t) {
       //menim aglima gelmemisdi internetden tapmisam bu versiyani. :)

        var i = 0;
        var j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }
}
