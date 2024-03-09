package questions;

public class ArrayPalindrome {

    public static boolean CheckPalinddrome(int[] A){
        if(A.length==0){
            System.out.println("input is not valid array");
        return false;
        }
        for(int i=0,j=A.length-1;i<j;i++,j--){
            if(A[i]!=A[j]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] A = {22,44,55,44,22};
        if (CheckPalinddrome(A) == true) {
                System.out.println("Given Array is plaindrome");
        } else System.out.println("Given Array is not plaindrome");

    }
}
