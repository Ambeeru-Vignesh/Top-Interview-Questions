class Solution {
    public int longestMountain(int[] arr) {
        int longestMountain=0;
        int i=1;
        
        while(i<arr.length-1){
            
            boolean peak = arr[i-1]<arr[i] && arr[i]>arr[i+1];
            if(!peak){
                i++;
                continue;
            }
            
            int left=i-2;
            while(left>=0 && arr[left]<arr[left+1]){
                left--;
            }
            
            int right=i+2;
            while(right<arr.length && arr[right]<arr[right-1]){
                right++;
            }
            
            int currentLength=right-left-1;
            if(currentLength>longestMountain){
                longestMountain=currentLength;
            }
            
            i=right;
            
        }
        
        return longestMountain;
        
    }
}