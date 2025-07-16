package solutions.leetcode;

public class excel_Sheet_Column_Number {
    public int titleToNumber(String columnTitle) {
        var resp = 0;
        var coefficient = 1;
        for(int i = columnTitle.length() - 1; i >= 0; i--){
            var a = columnTitle.charAt(i) - 'A' + 1;
            resp += a*coefficient;
            coefficient*=26;
        }
        return resp;
    }
}
