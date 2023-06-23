import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for (int row = 1; row <= numRows; row++) {

            result.add(generateRow(row));

        }

        return result;
    }

    public List<Integer> generateRow(int row) {
        List<Integer> list = new ArrayList<>();
        int ans = 1;
        list.add(ans);

        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            list.add((int) ans);
        }

        return list;

    }
}