//Optimal Approach
class Solution {
    public int climbStairs(int n) {
        int a = 1;
        int b = 1;
        int c;

        for (int i = 0; i < n - 1; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}

// Bottom-up Approach
class Solution {
    public int climbStairs(int n) {

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}

// Top-down Approach

class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return climbStairs(n - 1, dp) + climbStairs(n - 2, dp);
    }

    public int climbStairs(int n, int[] dp) {

        if (n == 0) {
            return 0;
        }

        if (n == 0 || n == 1) {
            dp[n] = 1;
            return dp[n];
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = climbStairs(n - 1, dp) + climbStairs(n - 2, dp);
        return dp[n];
    }
}