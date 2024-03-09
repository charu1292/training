import static java.util.Collections.swap;

public class Reverse_array {





    public static void Reverse(int i,int[] A){
            int n =A.length;
            if (i>=n/2) return;
            swap(A[i],A[n-i-1]);
            Reverse(i+1,A);
        }

    private static void swap(int i, int j) {
        i=i=+j;
        j=i-j;
        i=i-j;

    }

    public static void main(String[] args) {
        int[] A ={2,4,5,6,7};
        Reverse(0,A);
        for(int i=0;i<A.length;i++){
            System.out.print(A[i] + " ");
        }

    }
}
