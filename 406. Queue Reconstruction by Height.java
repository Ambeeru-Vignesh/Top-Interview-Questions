import java.util.*;

class Solution {
    public int[][] reconstructQueue(int[][] people) {

        ArrayList<int[]> list = new ArrayList<>();
        Arrays.sort(people, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);

        for (int[] p : people) {
            list.add(p[1], p);
        }

        int[][] result = list.toArray(new int[list.size()][2]);

        return result;
    }
}