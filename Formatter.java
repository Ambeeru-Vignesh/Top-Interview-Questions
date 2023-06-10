import java.util.*;

public class Formatter {
    
    static String result;
    public static boolean repeatedSubstring(String s,HashMap<Integer,String> Map){
        int len=s.length();
        Map.put(len,s);
        if(len>=2){
            for(int i=len/2;i>=1;i--){
                if(len%i==0){
                    int num_repeats=len/i;
                    String substring=s.substring(0, i);
                    StringBuilder sb=new StringBuilder();
                    for(int j=0;i<num_repeats;j++){
                        sb.append(substring);
                    }
                    if(sb.toString().equals(s)) {
                        result=sb.toString();
                        return true;
                    }
                }
            
            }    
        }
        return false;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashMap<Integer,String> list=new HashMap<>();
        if(repeatedSubstring(str,list)){
            System.out.println("yes "+result);
        }

    }

}
