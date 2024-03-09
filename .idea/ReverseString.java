import java.util.Collections;

public class ReverseString {


  public static String Reverse(String s){
    char[] ss=s.toCharArray();
    for(int i=0,j=ss.length-1;i<j;i++,j--){
        ss[i]=(char) (ss[i]+ss[j]);
        ss[j]=(char) (ss[i]-ss[j]);
        ss[i]=(char) (ss[i]-ss[j]);
    }
    return new String(ss);
  }

  public static String Reverse2(String s){
      StringBuilder ss= new StringBuilder(s);
      for(int i=0,j=ss.length()-1;i<j;i++,j--){
          char t=s.charAt(i);
          ss.setCharAt(i,ss.charAt(j));
          ss.setCharAt(j,t);
      }

     return ss.toString();
  }
     ///recursive method to reverse a string
    public static char[] reverse_recursive(int i, String s) {
        char[] A = s.toCharArray();
        int n = A.length;
        if (i >= n / 2)
            return A;
        swap(A, i, n - i - 1);
        reverse_recursive(i + 1, s);
        return A;
    }

    private static void swap(char[] A, int i, int j) {
        char temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String args[]){

      String R1=Reverse("mohan is a bad boy");
      String R2=Reverse2("boy");

        System.out.println(R1);
        System.out.println(R2);

        char[] reversed = reverse_recursive(0, "charu");
        System.out.println(String.valueOf(reversed)); ;

    }
}
