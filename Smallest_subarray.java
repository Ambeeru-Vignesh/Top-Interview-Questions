import java.util.*;

public class Smallest_subarray {
    
    public static int minsum(int sum,int[] arr){

        int windowend=0,windowstart=0;
        int windowsum=0,min=Integer.MAX_VALUE;int windowlength;
        for(windowend =0;windowend<arr.length;windowend++){
            /*if (arr[windowend]>=sum){
                return 1;
            }*/
            windowsum+=arr[windowend];
            while(windowsum >=sum){
                windowlength=windowend-windowstart+1;
                min=Math.min(min,windowlength);
                windowsum-=arr[windowstart];
                windowstart++;
            }
        }

        return min;
    }
    public static void main(String[] args) {
        System.out.println(minsum(7,new int[] {2,1,5,2,3,2}));
        System.out.println(minsum(7, new int[] { 2, 1, 5, 2, 8 }));
        System.out.println(minsum(8, new int[] { 3, 4, 1, 1, 6 }));
    }

}
