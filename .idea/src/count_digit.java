public class count_digit {

        public static int countDigits(int n){
            // Write your code here.
            int count=0;
            while(n>0){
                int lastdigit=n%10;
                count=count+1;
                n=n/10;

            }
            return count;
        }

    public static void main(String[] args) {
        countDigits(3747236);
    }
    }

