import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> arr=new HashMap<>();
       for(int i=0;i<nums.length;i++){
           int potentialMatch=target-nums[i];
           if(arr.containsKey(potentialMatch)){
               return new int[] {arr.get(potentialMatch),i};
           }
           arr.put(nums[i],i);
       }
throw new IllegalArgumentException("No two sum solution");
    }
}
