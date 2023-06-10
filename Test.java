import java.util.*;

class Test{


public static int[] merge(int[] one, int[] two) {
    int[] sorted = new int[one.length + two.length];
    int i = 0;
    int j = 0;
    int k = 0;
    while (i <one.length && j < two.length) {
        if (one[i] < two[j]) {
            sorted[k] = one[i];
            k++;
            i++;
        } else {
            sorted[k] = two[j];
            k++;
            j++;
        }
    }
    
        while (j < two.length) {
            sorted[k] = two[j];
            k++;
            j++;
        }
    
    
        while (i < one.length) {
            sorted[k] = one[i];
            k++;
            i++;
        }
    
    return sorted;
}
public static int[] mergeSort(int[] arr, int lo, int hi) {
    if (lo == hi) {
        int[] br = new int[1];
        br[0] = arr[lo];
        return br;
    }
    int mid = (lo + hi) / 2;
    int[] firstHalf = mergeSort(arr, lo, mid);
    int[] secondHalf = mergeSort(arr, mid + 1, hi);
    int[] sorted = merge(firstHalf, secondHalf);
    return sorted;
}
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int in=sc.nextInt();
        int[] arr=new int[in];
        for(int i=0;i<in;i++){
            arr[i]=sc.nextInt();
        }
        int [] sorted=mergeSort(arr, 0, arr.length-1);   
        for(int i=0;i<sorted.length;i++){
            System.out.print(sorted[i]+" ");
        }  
    }
}