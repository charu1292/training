import java.util.HashMap;
import java.util.Map;

public class remove_duplicates_using_hasmap {


    public static int[] remove(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i]) + 1);
            } else
                map.put(A[i], 1);
        }


    int res[] = new int[map.size()];
    int k = 0;
        for(
    Map.Entry<Integer, Integer> entry:map.entrySet())
    {
        res[k++] = entry.getKey();

    }
     return res;
}


    public static void main(String[] args) {
        int A[]={22,44,55,22,56,44,888,90};
        int[] result=remove(A);
        for (int i=0;i<result.length;i++) {
            System.out.print(result[i] + " ");
        }

    }
}
