package solutions.leetcode;

import java.util.ArrayList;
import java.util.List;

public class pascal_Triangle_II {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < rowIndex+1; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int left = result.get(i - 1).get(j - 1);
                    int right = result.get(i - 1).get(j);
                    row.add(left + right);
                }
            }
            result.add(row);
        }

        return result.get(rowIndex);
    }
}
