package cham_prac;

public class BasicPrograms {

    public static String reverse(String s) {
        char[] arr = s.toCharArray();
        for(int i = 0, j = arr.length - 1; i < j; i++, j--) {
            arr[i] = (char) (arr[i] + arr[j]);
            arr[j] = (char) (arr[i] - arr[j]);
            arr[i] = (char) (arr[i] - arr[j]);
        }
        return new String(arr);
    }

    public static String reversePart2(String s) {
        StringBuilder ss = new StringBuilder(s);
        for(int i = 0, j = ss.length() - 1; i < j; i++, j--) {
            char t = ss.charAt(i);
            ss.setCharAt(i, ss.charAt(j));
            ss.setCharAt(j, t);
        }
        return ss.toString();
    }


}
