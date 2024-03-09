import java.util.Arrays;

public class check_annagram {

    public static boolean check_annagram(String S1,String S2){
        char[] C1=S1.toCharArray();
        char[] c2=S2.toCharArray();
        Arrays.sort(C1);
        Arrays.sort(c2);

        String s1 =new String(C1);
        String s2 =new String(c2);

        return s1.equals(s2);
    }


    public static void main(String[] args) {
        String S1="abc";
        String S2="bda";
        System.out.println(check_annagram(S1,S2));
    }
}
