package solutions.leetcode;

public class number_Of_Segments_In_String {
    public static int countSegments(String s) {
        if(s.trim().isEmpty()) return 0;
        var arr = s.trim().split("\\s+");
        return arr.length;
    }
}
