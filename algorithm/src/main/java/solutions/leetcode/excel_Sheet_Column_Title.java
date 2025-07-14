package solutions.leetcode;

public class excel_Sheet_Column_Title {
    public static String convertToTitle(int columnNumber) {
        var str = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            int remainder = columnNumber % 26;
            str.insert(0, (char) ('A' + remainder));
            columnNumber = columnNumber / 26;
        }

        return str.toString();
    }
}
