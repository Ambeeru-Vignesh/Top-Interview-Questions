import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        
        int longestLength=0;
        HashMap<Integer,Boolean> map=new HashMap<Integer,Boolean>();
        
        for(int num:nums){
            map.put(num,true);
        }
        
        for(int num:nums){
            if(!map.get(num)){
                continue;
            }
            
            map.put(num,false);
            int currentLength=1;
            int left=num-1;
            int right=num+1;
            
            while(map.containsKey(left)){
                map.put(left,false);
                currentLength++;
                left--;
            }
            
            while(map.containsKey(right)){
                map.put(right,false);
                currentLength++;
                right++;
            }
            
            if(currentLength > longestLength){
                longestLength=currentLength;
            }
            
        }
        
        return longestLength;
        
    }
}