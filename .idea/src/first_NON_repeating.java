import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Map;

public class first_NON_repeating {
        public static char non_repeating(String s){
            char[] A=s.toCharArray();
            Map<Character,Integer> map=new HashMap<>();
            for (int i=0;i<s.length();i++){
                if(map.containsKey(A[i])){
                    map.put(A[i], map.get(A[i])+1);
                }
                else map.put(A[i],1);
            }


            char res = 0;
            for(int i = 0; i < s.length(); i++) {
                if(map.get(s.charAt(i)) == 1) {
                    res = s.charAt(i);
                    break;
                }
            }
            return res;
        }

        public static void main(String[] args) {
            String S="AAATU";
            char C =non_repeating(S);
            System.out.println(C);
        }
    }

