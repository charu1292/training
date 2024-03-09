public class left_rotate_array {



    public static void left_rotate(int[] A){
        int n=A.length;
         int temp=A[0];
         for(int i=1;i<A.length;i++)
         {
             A[i-1]=A[i];
         }
         A[n-1]=temp;
    }


    public static void main(String[] args) {
        int[] A={1,2,3,4,5,6};
        left_rotate(A);
        for(int i=0;i<A.length;i++){
            System.out.print(A[i] + " ");
        }
    }
}
