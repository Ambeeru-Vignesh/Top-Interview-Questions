import java.util.*;

class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ", 0);

        String res = str[str.length - 1];

        return res.length();

    }
}