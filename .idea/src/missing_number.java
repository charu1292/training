public class missing_number {

   public static int missing(int[] A){
       int n=A.length;
       int sum =(n*(n+1))/2;
       for(int i=0;i<n;i++){

           sum=sum-A[i];
       }
       return sum;

    }




    public static void main(String[] args) {
        int[] A ={0,1,2,4,5,6,7,8};
        System.out.println(missing(A));
    }
}
