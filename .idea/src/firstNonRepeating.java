package cham_prac;

import java.util.HashMap;
import java.util.Map;

public class firstNonRepeating {
    public static char firstNonRepeating(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
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
        String s="AmAn";
        char S1= firstNonRepeating(s);

        System.out.println(S1);
    }
}
