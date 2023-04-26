import java.util.*;

class Solution {
    public String convert(String s, int numRows) {
        
        if (numRows == 1){
            return s;
        }
        
        char[] str1 = s.toCharArray();
        int n=s.length();
        
        String[] arr= new String[numRows];
        Arrays.fill(arr,"");
        
        int row=0;
        boolean down=true;
        
        for(int i=0;i<n;i++){
            
           arr[r.+= (str1[i]);
             
            if(row==0){
                down=true;
            }
            if(row==numRows-1){
                down=false;
            }
            
            if(down){
                row++;
            } else{
                row--;
            }
        }
        
        String ans="";
        for(int i=0;i<numRows;i++){
            ans=ans+arr[i];
        }
        
        return ans;
    }
}
