package solutions.leetcode;

import java.util.HashMap;

public class romanToInteger {
    public static int romanToInt(String s) {
        var map = new HashMap<Character, Integer>(); //MCMXCIV
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        var resp = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));
            if (i < s.length() - 1 && current < map.get(s.charAt(i + 1))) {
                resp -= current;
            } else {
                resp += current;
            }
        }

        return resp;
    }
}
