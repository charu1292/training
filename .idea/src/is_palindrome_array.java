public class is_palindrome_array {


    public static boolean checkPalindrome(int[] A){
        for (int i=0,j=A.length-1;i<j;i++,j--){
            if (A[i]!=A[j]);
            return false;

        }
        return true;
    }

    public static boolean palindrome_recurssion(int i,int[] A){
        int n=A.length;
        if( i >= n/2)
            return true;
        if(A[i]!=A[n-i-1])
            return false;
    return palindrome_recurssion(i+1,A);
    }

    public static void main(String[] args) {
        int[] A={22,44,44,22};

        if (palindrome_recurssion(0,A)==true){
            System.out.println("Given array is palindrome");
        }
        else {
            System.out.println("Given array is not palindrome");
        }

    }
}
