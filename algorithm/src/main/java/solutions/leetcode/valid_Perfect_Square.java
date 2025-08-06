package solutions.leetcode;

public class valid_Perfect_Square {
    public boolean isPerfectSquare(int num) {
        //bu binary search varianti menim aglima gelmemisdi.
        if (num < 1) return false;
        if (num == 1) return true;

        long left = 1, right = num / 2;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) return true;
            else if (square < num) left = mid + 1;
            else right = mid - 1;
        }

        return false;


        //bu menim aglima gelen variant idi duzgun isleyir amma time limit xetasi verir
//        if(num<1) return false;
//        if(num==1) return true;
//        for(var i =2; i <= num/2; i++){
//            if(i*i==num) return true;
//        }
//        return false;
    }
}
