package cham_prac;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class removeDuplicates {
    public static int[] removeDuplicates(int[] arr) {

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++) {
        set.add(arr[i]);
        }
        int[] res = new int[set.size()];
        int k = 0;
        for(int num : set) {
        res[k++] = num;
        }
        return res;
        }


public static int[] removeDuplicates_1(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
        if(map.containsKey(arr[i])) {
        map.put(arr[i], map.get(arr[i]) + 1);
        } else {
        map.put(arr[i], 1);
        }
        }
        int[] res = new int[map.size()];
        int k = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
        res[k++] = entry.getKey();
        }
        return res;
        }


public static int[] removeDuplicates_2(int[] arr) {
        int top = -1;
        for(int i = 0; i < arr.length; i++) {
        if(top == -1 || arr[i] != arr[top]) {
        arr[++top] = arr[i];
        }
        }
        int[] res = new int[top + 1];
        for(int i = 0; i < top + 1; i++) {
        res[i] = arr[i];
        }
        return res;
        }


    public static void main(String[] args) {
    int[] arr={2,3,42,1,3,2,42,6,2};

        System.out.println( removeDuplicates(arr));
    }

}