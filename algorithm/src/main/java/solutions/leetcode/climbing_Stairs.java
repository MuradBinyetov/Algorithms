package solutions.leetcode;

public class climbing_Stairs {
    public int climbStairs(int n) {
        int p1 = 0, p2 = 0, p0 = 1;
        for (int i = 1; i <= n; i++)
        {
            p1 = p2;
            p2 = p0;
            p0 = p1 + p2;
        }
        return p0;
    }
}
