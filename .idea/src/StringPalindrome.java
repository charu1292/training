package questions;

public class StringPalindrome {

public static boolean Palindrome(String s) throws Exception {
        if (s == null)
            return false;
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        try {
            String s="";
        Palindrome(s);

        if(Palindrome(s)==true){
            System.out.println("string is palindrome");
        }
        else System.out.println("not a palindrome");
    }

        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

        }