class Solution {

    public boolean isIncreasing(int[] nums) {
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i + 1] >= nums[i])
                i++;
            else
                return false;
        }
        return true;
    }

    public boolean isDecreasing(int[] nums) {
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i + 1] <= nums[i])
                i++;
            else
                return false;
        }
        return true;
    }

    public boolean isMonotonic(int[] nums) {

        boolean increase = true;
        boolean decrease = true;

        if (nums.length <= 2) {
            return true;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i]) {
                continue;
            } else if (nums[i + 1] > nums[i]) {
                increase = isIncreasing(nums);
                break;
            } else {
                decrease = isDecreasing(nums);
                break;
            }
        }

        return increase && decrease;
    }
}