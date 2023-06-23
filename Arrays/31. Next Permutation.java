class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int index = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            reverseArray(nums, 0);
        }

        else {
            // step 2 find next greater element and swap with ind2
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] > nums[index]) {
                    swap(nums, i, index);
                    break;
                }
            }
            // step 3 reverse the rest right half
            reverseArray(nums, index + 1);
        }

    }

    private static void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }

    private static void reverseArray(int[] array, int i) {
        int start = i;
        int end = array.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move the start and end indices towards the center
            start++;
            end--;
        }
    }
}