package solutions.leetcode;

import java.util.HashMap;

public class isomorphic_Strings {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        var map = new HashMap<Character, Character>();
        for(int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))){
                if(map.containsValue(t.charAt(i))) return false;
                map.put(s.charAt(i), t.charAt(i));
            }
            else{
                var value = map.get(s.charAt(i)).charValue();
                if(value!=t.charAt(i)) return false;
            }
        }
        return true;
    }
}
