package questions;

import java.util.HashMap;
import java.util.Map;

public class FrequencyString {

     public static void FrequencyString(String s){
         char[] A=s.toCharArray();
         Map<Character,Integer> map=new HashMap<>();
         for (int i=0;i<A.length;i++){
             if(map.containsKey(A[i])){
                 map.put(A[i], map.get(A[i])+1);
             }
             else {
                 map.put(A[i],1);
             }
         }

         for(Map.Entry<Character,Integer> entry:map.entrySet()){
             Character Key=entry.getKey();
             Integer value= entry.getValue();
             System.out.println(Key + ":" + value);
         }

     }

    public static void main(String[] args) {
        String S="abaacba";
        FrequencyString(S);

    }
}
