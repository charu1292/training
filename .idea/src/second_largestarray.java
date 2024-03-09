public class second_largestarray {


    ///time complexity of big of 2N


    public static int second_largest_number(int[] A){
        int l=largestnumber(A);
        int second_largest=-1;
        for(int i=0;i< A.length;i++){
            if(A[i]>second_largest && A[i]!=l){
                second_largest=A[i];
            }

        }
        return second_largest;
    }

    private static int largestnumber(int[] A) {
        int largest = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > largest) {
                largest = A[i];
            }

        }
        return largest;
    }




    public static void main(String[] args) {
        int[] A = {3, 45, 12, 46, 98, 65, 88, 21};
        int n = A.length;
        int c = second_largest_number(A);
        System.out.print(c);
    }
}
