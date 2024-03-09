public class seprate_negatives {


    public void separate(int[] A) {
        int i = 0;

        int n = A.length;
        int j = n - 1;
        while (i < j) {
            if (A[i] < 0)
                i++;
            else if (A[j] >= 0)
                j--;
            else {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;


        }

        }
    }
        public static void main (String[]args){
            seprate_negatives ss = new seprate_negatives();
            int A[] = {34,-1, -2, -8, 16, 78};
            ss.separate(A);
            for (int c : A) {
                System.out.print(c + " ");
            }
        }

}