public class string_palindrome {


    public static boolean palindrome_string(String S){
        char[] S1=S.toCharArray();
        for (int i=0,j=S1.length-1;i<j;i++,j--) {
            if (S1[i] != S1[j])
                return false;
        }
        return true;


    }

////single pointer approach
   public static boolean check_palindorme_string(int i,String s){
      char[] S=s.toCharArray();
       int n=S.length;
       if (i>=n/2) return true;
       if(S[i]!=S[n-i-1]) return false;
       return check_palindorme_string(i+1,s);
   }

    public static void main(String[] args) {
        String s="mam";
        if (check_palindorme_string(0,s)==true){
            System.out.println("Given String is palindrome");
        }
        else {
            System.out.println("Given String is not palindrome");
        }
    }
}
