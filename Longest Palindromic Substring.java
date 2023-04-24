class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String res = "";
        int max_size = 0;

        for (int i = 0; i < n; i++) {
            int l = i;
            int r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if ((r - l + 1) > max_size) {
                    res = s.substring(l, r + 1);
                    max_size = r - l + 1;
                }
                l -= 1;
                r += 1;
            }

            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if ((r - l + 1) > max_size) {
                    res = s.substring(l, r + 1);
                    max_size = r - l + 1;
                }
                l -= 1;
                r += 1;
            }
        }
        return res;

    }
}