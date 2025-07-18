package solutions.leetcode;

public class reverse_Bits {
    public static int reverseBits(int n) {
        //bu alqoritm ne isteyir basa dusmedim tam. men verilen 2 lik say sistemini edede cevirib qaytardim

        var nString = String.valueOf(n);
        var index = 1;
        var sum = 0;
        for(int i =nString.length()-1; i >= 0; i-- ){
            if(nString.charAt(i) == '1'){
                sum+=index;
            }
            index *= 2;

        }
        return sum;
    }
}
