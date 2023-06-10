import java.util.*;


public class Triplet
{

    public static int findAllTriplets(int[] array)
    {
        int count=0;
        if (array.length < 3) {
            return 0;
        }
        for (int j = 1; j < array.length - 1; j++)
        {
           
            int i = j - 1, k = j + 1;
            while (true)
            {
               
                while (i >= 0 && k <= array.length - 1 &&
                        (array[j] % array[i] == 0) && (array[k] % array[j] == 0) &&
                        (array[j] / array[i] == array[k] / array[j]))
                {
                    count+=1;
 
                    k++;
                    i--;
                }
 
                if (i < 0 || k >= array.length) {
                    break;
                }
 
                if (array[j] % array[i] == 0 && array[k] % array[j] == 0)
                {
                    if (array[j] / array[i] < array[k] / array[j]) {
                        i--;
                    }
                    else {
                        k++;
                    }
                }

                else if (array[j] % array[i] == 0) {
                    k++;
                }
                else {
                    i--;
                }
            }
        }
        return count;
    }
 
    public static void main(String[] args)
    {
      
        Scanner sc=new Scanner(System.in);
        int z=sc.nextInt();
        int r=sc.nextInt();
        int[] A = new int[z];
        for(int i=0;i<z;i++){
            A[i]=sc.nextInt();
        }
        int result=findAllTriplets(A);
        System.out.println(result);
    }
}



