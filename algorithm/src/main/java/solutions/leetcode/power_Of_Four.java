package solutions.leetcode;

public class power_Of_Four {
    public boolean isPowerOfFour(int n) {
        if(n <= 0) return false;
        if(n == 1) return true;
        while(n > 4){
            if(n % 4 != 0) return false;
            n /= 4;
        };
        return true;
    }
}
