import java.util.*;

class Solution {
    public int[] singleNumber(int[] nums) {
        int[] result = new int[2];
        int i = 0;
        HashMap<Integer, Integer> Map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            Map.put(num, Map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (Map.get(num) == 1) {
                result[i++] = num;
            }
        }

        return result;
    }
}