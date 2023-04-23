import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        if (s.equals("")) {
            return 0;
        }
        int maxans = Integer.MIN_VALUE;
        HashSet<Character> set = new HashSet<>();
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            if (set.contains(s.charAt(r))) {
                while (l < r && set.contains(s.charAt(r))) {
                    set.remove(s.charAt(l));
                    l++;
                }
            }
            set.add(s.charAt(r));
            maxans = Math.max(maxans, r - l + 1);
        }

        return maxans;

    }
}