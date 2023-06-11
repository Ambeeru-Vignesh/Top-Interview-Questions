class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int first = binarySearch(nums, 0, n-1, target, true);
        int last = binarySearch(nums, 0, n-1, target, false);
        
        int[] arr = new int[2];
        arr[0] = first;
        arr[1] = last;
        
        return arr;
    }
    
    public static int binarySearch(int[] nums, int low, int high, int target, boolean findFirst) {
        
        if(high < low){
            return -1;
        }
        
        int mid = low + (high-low) / 2;
        
        if(findFirst) {
            
            if((mid==0 || target > nums[mid-1]) && nums[mid]==target ) {
                return mid;
            }
            else if (target > nums[mid]) {
                return binarySearch(nums, mid+1, high, target, findFirst);
            }
            else {
                return binarySearch(nums, low, mid-1, target, true);
            }
            
        } else {
            
            if((mid == nums.length-1 || target < nums[mid+1]) && nums[mid]==target ) {
                return mid;
            }
            else if (target < nums[mid]) {
                return binarySearch(nums, low, mid-1, target, findFirst);
            }
            else {
                return binarySearch(nums, mid+1, high, target, findFirst);
            }   
        }
    }
}