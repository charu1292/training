package cham_prac;

import java.util.Arrays;

public class checkAnaGram {
    public static boolean checkAnaGram(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        s1 = new String(arr1);
        s2 = new String(arr2);
        return s1.equals(s2);
    }

    public static void main(String[] args) {

        System.out.println(checkAnaGram("abc", "abc"));
    }
}
