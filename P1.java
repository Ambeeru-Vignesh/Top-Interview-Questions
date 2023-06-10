import java.util.*;

public class P1 {
    
    public static int tripsum(int k, int[] arr){
        int windowend=0,windowstart=0;
        int windowsum=0,maxsum=0;
        for( windowend=0;windowend<arr.length;windowend++){
            windowsum+=arr[windowend];
            if(windowend>=k-1){
                maxsum=Math.max(maxsum,windowsum);
                windowsum-=arr[windowstart];
                windowstart++;
            }
        }
        return maxsum;
    }

    public static void main(String[] args){
        int arr[]={2,1,5,1,3,2};
        int k=3;
        System.out.println(tripsum(k, arr));
    }
}
