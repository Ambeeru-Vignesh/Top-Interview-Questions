import java.util.*;

class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> tripleList = new ArrayList<List<Integer>>();

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> result = new ArrayList<Integer>();
                    result.add(nums[i]);
                    result.add(nums[left]);
                    result.add(nums[right]);
                    tripleList.add(result);
                    left++;
                    right--;
                    while (left + 1 <= right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
            while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                i++;
            }
        }

        return tripleList;

    }

    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        System.out.println(Solution.threeSum(arr));

    }

}