public class check_sum_of_two {

    public static  void checksum_sorted(int[] A,int x){
        for(int i=0,j=A.length-1;i<j;){
            if(A[i]+A[j]==x){
                System.out.println("Pairs found " + A[i] + "," + A[j]);
            }
            else if (A[i]+A[j]<x)
              i++;
            else
                j--;
        }
    }


    public static void check_sum_unsorted(int[] A,int x){
        for (int i=0;i<A.length-1;i++){
            for (int j=i+1;j<A.length;j++)
            if(A[i]+A[j]==x){
                System.out.println("Pairs found " + A[i] + "," + A[j]);
            }
        }


    }

    public static void main(String[] args) {
        int[] A={1,9,3,6,5,4,7,8,2};
        int x=10;
        check_sum_unsorted(A,x);
    }
}
