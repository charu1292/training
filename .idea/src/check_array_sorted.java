public class check_array_sorted {

    public static boolean check_array(int[] A){
        int n = A.length;

        for(int i=1;i<n;i++){
            if(A[i]>=A[i-1]){

            }
            else return false;
        }
        return true;
    }




    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,7};
        System.out.println(check_array(A));

    }
}
