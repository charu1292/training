package cham_prac;

public class CheckPalindrome {
    ///check given array is palindrome of not
    public static boolean checkPalindrome(int[] A) {
        for (int i = 0, j = A.length - 1; i < j; i++, j--) {
            if (A[i] != A[j]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] A = {22, 33, 44, 55, 22};
        if (checkPalindrome(A) == true) {
            System.out.println("GIven array is palindrome");
        } else {
            System.out.println("given string is not palindrome");
        }

    }

}