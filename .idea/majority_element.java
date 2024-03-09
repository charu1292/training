import javax.swing.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class majority_element {


//A majority element in an array A[] of size n is an element that appears more than n/2 times

    public static void checkMajority(int[] A){
        int n =A.length;
        int majority_element_freq=(n/2)+1;

        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++) {

            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry :map. entrySet()){
            Integer key= entry.getKey();
            Integer value=entry.getValue();
            if(value>=majority_element_freq)
                System.out.print(key + " ");
            else System.out.println("no element found");

        }
    }

    public static void main(String[] args) {
        int[] A = {2, 1, 1, 1, 2, 3, 4, 5, 2 ,1};

        checkMajority(A);

    }
}
