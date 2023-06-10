import java.util.HashMap;
import java.util.Scanner;

class Multi{
    int value1;
    int value2;
    Multi(int x,int y){
        this.value1=x;
        this.value2=y;
    }
}

public class TwoSum{

    public static Multi twosum(int[] arr,int sum){

        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    
        for (int i=0;i<arr.length;i++){
            if (map.containsKey(sum-arr[i])){
                return new Multi(map.get(arr[sum-arr[i]]),arr[i]);
            }
            else{
                map.put(arr[i],i);

            }
        }
        return null;
    }

    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);
        int n=myObj.nextInt();
        
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=myObj.nextInt();
        }
        int sum=myObj.nextInt();

        Multi p=twosum(arr,sum);
        System.out.println(p.value1+" "+p.value2);

        myObj.close();
    }
}