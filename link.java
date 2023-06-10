import java.util.*;
class link{
    public static void main(String[] args) {
        int[] arr={1,2,2,2,2,3,3,3};
        int x=1;
        TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();

        for (int i : arr) {
            if(map.containsKey(i)){
                int val=map.get(i);
                val+=1;
                map.put(i,val);
                if(val>2){
                    map.put(i,2);
                }
            } else{
                map.put(i,1);
            }
        } 
        String str="";
        for(Map.Entry<Integer,Integer> e:map.entrySet()){

            if(e.getValue()<=2){
                int count=e.getValue();
                while(count>0){
                str+=Integer.toString(e.getKey());               
                count--;
                }
            }
        }
        char[] ch=str.toCharArray();
        System.out.println(Arrays.toString(ch));
}
}
