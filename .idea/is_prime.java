public class is_prime {

    public static boolean is_prime(int num) {
        for(int i=2;i<num;i++)
        if(num%i==0){
            return false;
        }
            return true;
    }

    public static void print_primes(int num){
        for (int i=1;i<=num;i++)
        {
            if (is_prime(i)){
                System.out.print(i + " ");
            };
        }
    }

    public static void main(String[] args) {
        int num=4;
        if(is_prime(num)){
            System.out.println(num + " is a prime number");
        }

        else {
            System.out.println(num + " Not a prime number");
        }
        print_primes(num);
    }
}
