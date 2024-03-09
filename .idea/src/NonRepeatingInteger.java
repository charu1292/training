package questions;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingInteger {

    public static int NonRepeatingInteger(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i]) + 1);
            } else {
                map.put(A[i], 1);
            }
        }
        int num = 0;
        for (int i = 0; i < A.length; i++) {
            if (map.get(A[i]) == 1) {
                num = A[i];
                break;
            }
        }
        return num;

    }

    public static void main(String[] args) {
        int[] A = {9, 3, 9, 6, 7, 4};
        int c = NonRepeatingInteger(A);
        System.out.println(c);
    }
}
