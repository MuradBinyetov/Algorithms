package solutions.leetcode;

public class plus_One {
    public int[] plusOne(int[] digits) {
        if(digits.length == 1 && digits[0] == 9) return new int[]{1,0};
        if(digits[digits.length-1] != 9){
            digits[digits.length-1]++;
            return digits;
        }
        else{
            int i = digits.length-1;
            var isRemember = false;
            while(i<=digits.length-1 && i>=0){
                digits[i]++;
                if(digits[i] == 10){
                    digits[i] = 0;
                    isRemember = true;
                    i--;
                }else{
                    isRemember = false;
                    break;
                }
            }
            if(isRemember){
                int[] newArr = new int[digits.length + 1];
                newArr[0] = 1;
                for (var j = 0; j < digits.length; j++){
                    newArr[j+1] = digits[j];
                }
                return newArr;
            }
        }
        return digits;
    }
}
