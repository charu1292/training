public class fabanacci {

    static int fabanacci(int n){
        return(n<=2?n:fabanacci(n-1)+fabanacci(n-2));
    }

    static int a=0;
    static int b=1;
    static int c;

    static void print_fabanacci(int i){
        if(i>=1){
            c=a+b;
            System.out.print(c +" ");
            a=b;
            b=c;
            print_fabanacci(i-1);

        }

    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(fabanacci(n));

        System.out.print(a +" "+b + " ");
        print_fabanacci(n);
    }
}


