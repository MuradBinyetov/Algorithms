package solutions.leetcode;

public class number_of_1_Bits {
    public static int hammingWeight(int n) {
        StringBuilder str = new StringBuilder();
        while(n>=2){
            var reminder = n%2;
            str.insert(0,reminder);
            n/=2;
        }
        str.insert(0,1);
        var respCount =0;
        for(var i =0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                respCount++;
            }
        }
        return respCount;
    }
}
