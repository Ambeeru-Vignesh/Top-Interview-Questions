import java.util.*;

public class Hello {

    public static boolean isomorphic(String s, String t){
        if (s.length()!=t.length()){
            return false;
        }

        if (s==null|| t==null){
            return false;
        }

        HashMap<Character, Character> map = new HashMap<Character, Character>();

        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);

            if (map.containsKey(c1)){
                if (map.get(c1)!=c2){
                    return false;
                }
            }
            else{

                if (map.containsValue(c2)){
                    return false;
                }
                map.put(c1,c2);  
                }
            }

            return true;
    }

    public static void main(String[] args) {

        String s="axbx";
        String d="bcdc";
        System.out.println(isomorphic(s,d));
        
    }
}