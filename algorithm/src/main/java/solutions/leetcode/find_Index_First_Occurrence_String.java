package solutions.leetcode;

public class find_Index_First_Occurrence_String {
    public static int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)) return -1;
        if(haystack.length() < needle.length()) return -1;
        int index =-1;
        for(var i =0; i < haystack.length(); i++) {
            for (var j = 0; j < needle.length(); j++) {
                if(haystack.charAt(i) != needle.charAt(j)){
                    if(index != -1){
                        i= index;
                        index = -1;

                    }
                    break;
                }
                else {
                    if(index == -1){
                        index = i;
                    }
                    i++;
                }
                if(j == needle.length()-1 && index != -1){
                    return index;
                }
            }

        }
        return index;

    }
}
