import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       int rem,rev=0,p=1;
        while (n>0){
            rem=n%b;
            
            rev+=rem*p;
            p=p*10;
            n=n/8;
        }
        return rev;

   }
  }