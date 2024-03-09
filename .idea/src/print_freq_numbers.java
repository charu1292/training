import java.util.HashMap;
import java.util.Map;

public class print_freq_numbers {


    public static void freq_numbers(int[] A){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                map.put(A[i], map.get(A[i])+1);
            }
            else map.put(A[i],1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            Integer key= entry.getKey();
            Integer value=entry.getValue();
            System.out.println(key + " repeat " + value +" " + "times");
        }


    }

    public static void main(String[] args) {
        int[] A={2,4,5,6,4,2,5,2,5};
        freq_numbers(A);
    }
}
