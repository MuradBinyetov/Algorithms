package solutions.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class valid_Parentheses {
    public static boolean isValid(String s) {
        if(s.length() %2 != 0) return false;
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        var stack = new Stack<Character>();

        for(var c : s.toCharArray()) {
            if(map.containsKey(c)) {
                var top = !stack.isEmpty() ? stack.pop() : '.';
                if(top != map.get(c)) return false;
            }
            else{
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
