class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int prefix[] = new int[n];
        int product[] = new int[n];

        prefix[0] = 1; // since first element can have no prefix
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }
        int suffix[] = new int[n];
        suffix[n - 1] = 1; // since last element can have no suffix
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }
        // Building Product Array
        for (int i = 0; i < n; i++) {
            product[i] = prefix[i] * suffix[i];
        }

        return product;
    }
}