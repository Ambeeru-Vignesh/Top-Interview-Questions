import java.util.ArrayList;
import java.util.List;

class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, List<Integer> tempList, List<List<Integer>> result) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i])) {
                    continue; // Skip duplicates
                }
                tempList.add(nums[i]);
                System.out.println("****" + tempList + i);
        

                backtrack(nums, tempList, result);
                tempList.remove(tempList.size() - 1);
                System.out.println("----" + tempList);
            }
        }
    }

    public static void main(String[] args) {
        Permutations permutations = new Permutations();
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> result = permutations.permute(nums);
        System.out.println(result);
    }
}
