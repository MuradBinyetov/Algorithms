package solutions.leetcode;

public class palindrome_Number {
    public boolean isPalindrome(int x) {
        var realNum = x;
        int reverseNum = 0;
        while (x > 0) {
            reverseNum = reverseNum * 10 + x % 10;
            x = x / 10;
        }
        return (reverseNum == realNum);
    }
}
