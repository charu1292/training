package cham_prac;

public class isPrime{
    public static boolean isPrime(int num) {

        for(int i = 2; i < num; i++) {
        if(num % i == 0)
        return false;
        }
        return true;
        }

    public static void printPrimes(int n) {
        for(int i = 1; i <=n; i++) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        isPrime(2);
    }
        }
