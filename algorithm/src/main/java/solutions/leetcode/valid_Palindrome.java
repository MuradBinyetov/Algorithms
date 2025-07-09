package solutions.leetcode;

import java.util.Objects;

public class valid_Palindrome {
    public static boolean isPalindrome(String s) {
        if (s == null) return false;

        // Sətiri təmizlə və kiçik hərfə çevir
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;


    // Asagidaki kod isleyir amma gec isleyir:

//        if(Objects.equals(s, " ")) return true;
//        s = s.replaceAll("[^a-zA-Z0-9]", "");
//        for (int i = 0; i < s.length()/2; i++) {
//            for(var j = s.length()-1-i; j >= i; j--){
//                if(s.toLowerCase().charAt(i) == s.toLowerCase().charAt(j)){
//                    break;
//                }
//                else if(s.toLowerCase().charAt(i) != s.toLowerCase().charAt(j)){
//                    return false;
//                }
//            }
//        }
//        return true;
    }
}
