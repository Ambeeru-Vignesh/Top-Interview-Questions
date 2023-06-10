import java.util.*;
class Unique{
    static int i = 2;
    public static boolean isPrime(int n)
    {


        if (n <= 1)
        return false;
        else if (n == 2)
        return true;
        else if (n % 2 == 0)
        return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        int num;
        int c=0;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(int i=2;i<num;i++){
            int length = (int)(Math.log10(i)+1);
            int c1=0;
            if(isPrime(i)){
                if(length==1){
                    c++;
                }
                else{
                    int temp=i;
                    while(temp != 0)   
                    {  
                    int r = temp% 10;  
                    if(isPrime(r)){
                        c1++;
                    }
                    if(c1==length)
                    c++;
                    temp=temp/10;
                    }
                }
            }

        }
        System.out.println(c);
}
}