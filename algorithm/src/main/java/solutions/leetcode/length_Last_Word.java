package solutions.leetcode;

public class length_Last_Word {
    public int lengthOfLastWord(String s) {
        var strArr = s.split(" ");

        return strArr[strArr.length-1].length();
    }
}
