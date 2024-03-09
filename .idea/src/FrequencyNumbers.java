package questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//print frequency of numbers in an array
public class FrequencyNumbers {

    public static void FrequencyNumbers(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i]) + 1);
            } else {
                map.put(A[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }


    }
        public static void main (String[]args){
            int[] A = {2, 3, 5, 5, 2, 1, 2, 4, 4, 1};
            FrequencyNumbers(A);

        }
    }
