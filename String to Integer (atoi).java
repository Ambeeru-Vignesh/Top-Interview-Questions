class Solution {
    public int myAtoi(String s) {

        double number = 0;
        int i = 0;
        boolean isNegative = false;

        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        if (i == s.length()) {
            return 0;
        }

        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            isNegative = s.charAt(i) == '-' ? true : false;
            i++;
        }

        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {

            int digit = (s.charAt(i) - '0');
            number = number * 10 + digit;
            i++;

        }

        number = isNegative ? -number : number;

        if (number < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (number > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        return (int) (number);

    }
}