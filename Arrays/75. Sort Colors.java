class Solution {
    public void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, mid, low);
                low += 1;
                mid += 1;
            } else if (nums[mid] == 1) {
                mid += 1;
            } else {
                swap(nums, mid, high);
                high -= 1;
            }
        }
    }

    public static int[] swap(int[] nums, int l1, int l2) {
        int temp = nums[l1];
        nums[l1] = nums[l2];
        nums[l2] = temp;

        return nums;
    }
}