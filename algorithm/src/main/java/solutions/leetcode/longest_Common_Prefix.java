package solutions.leetcode;

import java.util.Objects;

public class longest_Common_Prefix {
    public static String longestCommonPrefix(String[] strs) {
        if(Objects.equals(strs[0], "")){
            return "";
        }
        var count = 1;
        var resp = "";
        var isContinue = true;
        for(int i = 0; i < strs[0].length(); i++){
            var prefix = strs[0].substring(0, count);
            for(int j = 0; j < strs.length; j++){
                if(count<= strs[j].length() && !prefix.equals(strs[j].substring(0, count))){
                    isContinue = false;
                    break;
                }
                if(count> strs[j].length()){
                    isContinue = false;
                }
            }
            if(isContinue){
                resp = prefix;
                count ++;
            }

        }

        return resp;
    }
}
