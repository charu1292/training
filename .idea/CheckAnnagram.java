package questions;

import java.util.Arrays;

public class CheckAnnagram {


    public static boolean CheckAnnagram(String S1,String S2){
        char[] A1=S1.toCharArray();
        char[] A2=S2.toCharArray();
        Arrays.sort(A1);
        Arrays.sort(A2);
        S1=new String(A1);
        S2=new String(A2);
        return S1.equalsIgnoreCase(S2);

    }


    public static void main(String[] args) {
        String S1="abc";
        String S2="BAC";
        boolean c=CheckAnnagram(S1,S2);
        if(c==true){
            System.out.println("Given Strings are annagrams of each other");
        }
        else System.out.println("Given Strings are not annagram of each other");
    }
}
