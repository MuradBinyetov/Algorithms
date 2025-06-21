package solutions.leetcode;

public class sqrt {
    public int mySqrt(int x) {
//        if(x==1)return 1;
//        for(int i = 1; i <= x; i++){
//            if(x % i == 0 && x / i == i){
//                return i;
//            }
//            else if( x / i < i){
//                return i-1;
//            }
//        }
//        return 0;



        if(x<2) return x;
        int left=1,right = x/2;
        int ans=0;
        while(left<= right)
        {
            int mid=left + (right-left)/2;
            long square =(long)mid*mid;
            if(square==x)
            {
                return mid;
            }
            else if(square<x)
            {
                ans= mid;
                left = mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return ans;
    }
}
