public class is_palindrome_number {

     // using iterative
    public static int reverse(int num) {
        int rev_num = 0;
        while (num > 0) {
            int lastdigit = num % 10;
            num = num / 10;
            rev_num = (rev_num * 10) + lastdigit;
        }
        return rev_num;
    }



    public static void main(String[] args) {
        int num = 20;
        int rev_num = reverse(num);
        if (rev_num == num) {
            System.out.println("given number is palindrome");
        } else {
            System.out.println("Not a plaindrome");
        }
    }
}
